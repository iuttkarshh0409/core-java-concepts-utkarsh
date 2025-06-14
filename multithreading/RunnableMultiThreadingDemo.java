//program to demonstrate multi-threading through Runnable interface
class MyThread implements Runnable {
    public void run() {
       try {
           for (int i = 5; i > 0; i--) {
               System.out.println("Child thread initialised...");
               Thread.sleep(1000); // Pause for 500ms
           }
       } catch (InterruptedException e) {
           System.out.println("Child Thread interrupted...");
       }
       System.out.println("Exiting Child Thread...");
   }
}

class RunnableMultiThreadingDemo {
   public static void main(String[] args) {
         MyThread MT= new MyThread();
         Thread t1= new Thread(MT);
         Thread t2= new Thread(MT);
         Thread t3= new Thread(MT);
         t1.start();
         t2.start();
         t3.start();
       try {
           for (int i = 5; i > 0; i--) {
               System.out.println("Main Thread Initialised...");
               Thread.sleep(10000); // Pause for 1000ms
           }
       } catch (InterruptedException e) {
           System.out.println("Main Thread Interrupted...");
       }
       System.out.println("Main Thread Exiting...");
   }
}