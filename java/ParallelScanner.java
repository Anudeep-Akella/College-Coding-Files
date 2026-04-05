import java.io.*;
import java.net.URI; // Use URI instead of just URL
import java.net.URL;
import java.util.Scanner;

public class ParallelScanner {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the file URL: ");
        String fileUrl = userInput.nextLine();

        System.out.print("Save as: ");
        String fileName = userInput.nextLine();

        try {
            // Shared buffer for the pipe
            PipedInputStream snifferIn = new PipedInputStream(4096); 
            PipedOutputStream downloaderOut = new PipedOutputStream(snifferIn);

            // 1. SCANNER THREAD (Daemon)
            Thread scannerThread = new Thread(() -> {
                try {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = snifferIn.read(buffer)) != -1) {
                        simulateVirusScan(buffer, bytesRead);
                    }
                    System.out.println("\n[SCANNER] Finished checking data chunks.");
                } catch (IOException e) {
                    System.err.println("[SCANNER] Pipe closed.");
                }
            });
            
            scannerThread.setDaemon(true); 
            scannerThread.start();

            // 2. DOWNLOADER THREAD (Producer)
            Thread downloaderThread = new Thread(() -> {
                try {
                    // MODERN WAY: String -> URI -> URL
                    URL url = URI.create(fileUrl).toURL();
                    
                    try (InputStream webIn = url.openStream();
                         FileOutputStream fileOut = new FileOutputStream(fileName)) {

                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        System.out.println("[DOWNLOADER] Fetching data...");

                        while ((bytesRead = webIn.read(buffer)) != -1) {
                            fileOut.write(buffer, 0, bytesRead);
                            downloaderOut.write(buffer, 0, bytesRead);
                        }
                        
                        downloaderOut.close(); 
                        System.out.println("[DOWNLOADER] Download complete.");
                    }
                } catch (Exception e) {
                    System.err.println("[ERROR] " + e.getMessage());
                }
            });

            downloaderThread.start();
            downloaderThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void simulateVirusScan(byte[] data, int length) {
        // Simulating the time it takes to run a signature check
        try { Thread.sleep(20); } catch (InterruptedException e) {} 
    }
}
