//program to demonstrate synchronised multi-threading
import java.util.Scanner;class Table {
    synchronized void printTable(int n) { // Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e);
            }
        }
    }
}

class Mythread1 extends Thread {
    Table t;
    Mythread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5); // Print table of 5
    }
}

class Mythread2 extends Thread {
    Table t;
    Mythread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(10); // Print table of 10
    }
}

class SyncMultiThreadingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Table obj = new Table();
        Mythread1 t1 = new Mythread1(obj);
        Mythread2 t2 = new Mythread2(obj);
        
        t1.start();
        t2.start();
    }
}