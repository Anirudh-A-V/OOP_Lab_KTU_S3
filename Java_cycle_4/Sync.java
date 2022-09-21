/**
 * This program is intended to show thread synchronization.
 * 
 * Question:
 * Write a Java program that shows thread synchronization.
 * 
 * This program is written by Anirudh A V
 */

class Main {
    void call(String thread) {
        System.out.printf("[");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception Occurred!! " + e);
        }
        System.out.printf("%s", thread);
        System.out.println("]");
    }
}

class Synchronisation implements Runnable {
    String thread;
    Thread t;
    Main m1;
    int flag;

    Synchronisation(String thr, int flag, Main m) {
        thread = thr;
        m1 = m;
        this.flag = flag;
        t = new Thread(this, thread);
        t.start();
    }

    public void run() {
        // Main m1 = new Main();
        if (flag == 0) {
            m1.call(thread);
        } else {
            synchronized (m1) {
                m1.call(thread);
            }
        }
    }
}

public class Sync {
    public static void main(String args[]) {
        Main m = new Main();
        System.out.println("With thread Synchronisation...");
        Synchronisation s4 = new Synchronisation("Thread 1", 1, m);
        Synchronisation s5 = new Synchronisation("Thread 2", 1, m);
        Synchronisation s6 = new Synchronisation("Thread 3", 1, m);
    }
}
