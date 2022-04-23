class T1 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                Thread.sleep(1000);
				if (i%2==0){
                    System.out.println("Even nummber - "+i);
                }
				
			}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class T2 implements Runnable {

    @Override
    public void run() {
        try {

            for (int i = 0; i <= 10; i++) {
                Thread.sleep(1000);
                if (i % 2 != 0) {
                    System.out.println("Odd nummber - " + i);
                }
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class Priority {
    public static void main(String[] args) {
        // T1 obj1 = new T1();
        Thread t1 = new Thread(new T1());

        // T2 obj2 = new T2();
        Thread t2 = new Thread(new T2());

        t1.start();
        
        System.out.println("Thread 1 priority : " + t1.getPriority());
        t1.setPriority(1);
        System.out.println("Thread 1 new priority : " + t1.getPriority());
        t2.start();
        System.out.println("Thread 2 priority : " + t2.getPriority());
        t2.setPriority(3);
        System.out.println("Thread 2 new priority : " + t2.getPriority());
    }
}
