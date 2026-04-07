public class CurrentThreadDemo {
    public static void main(String[] args) {
        // Getting the reference to the main thread
        Thread t = Thread.currentThread();
        System.out.println("--- Initial Thread Info ---");
        System.out.println("Current thread: " + t);
        System.out.println("Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
        // Modifying the current thread's properties
        t.setName("MyPrimaryThread");
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("\n--- Modified Thread Info ---");
        System.out.println("New Name: " + t.getName());
        System.out.println("New Priority: " + t.getPriority());
        // Demonstrating it inside a loop
        try {
            for (int n = 3; n > 0; n--) {
                System.out.println("Main thread counting down: " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        } }}

