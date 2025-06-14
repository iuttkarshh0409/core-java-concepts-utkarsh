//program to demonstrate multi-threading through Thread class
class NewThread extends Thread {
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread initialised...");
                Thread.sleep(500); // Pause for 500ms
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread interrupted...");
        }
        System.out.println("Exiting Child Thread...");
    }
}

class ThreadClassMultiThreadingDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start(); // Start the child thread
        
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread Initialised...");
                Thread.sleep(1000); // Pause for 1000ms
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted...");
        }
        System.out.println("Main Thread Exiting...");
    }
}