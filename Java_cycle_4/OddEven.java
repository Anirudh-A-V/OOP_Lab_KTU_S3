class Thread01 implements Runnable  {

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 100; i++) {
				if (i%2==0){
                    System.out.printf(" "+i);
                }
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Thread02 implements Runnable {

	@Override
	public void run() {
		try {
			
			for (int i = 0; i <= 100; i++) {
				if (i%2!=0){
                    System.out.print(" "+i);
                }
				Thread.sleep(100);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class OddEven {
    public static void main(String[] args) {
        Thread01 obj1 = new Thread01();
		Thread t1 = new Thread(obj1);

		Thread02 obj2 = new Thread02();
		Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
