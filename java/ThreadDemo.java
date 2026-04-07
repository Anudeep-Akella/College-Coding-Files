class MyThread extends Thread {
    
    // Constructor
    MyThread(String name) {
        // Calling the base class (Thread) constructor using super
        super(name);
        System.out.println("Child thread created: " + this);
        // Starting the thread right away
        this.start();
    }

    // The entry point for the child thread
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " (Child Thread) iteration: " + i);
                // Sleep to make the concurrency more visible
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " exiting.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Create and start the child thread
        new MyThread("MyChildThread");

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread iteration: " + i);
                // Sleep to allow child thread to interleave
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}

