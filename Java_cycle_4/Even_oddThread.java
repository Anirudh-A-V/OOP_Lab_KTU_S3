import java.util.Random;

class Square implements Runnable {
	Thread t;
	String thread;
	int num;

	Square(int num, String thr) {
		thread = thr;
		this.num = num;
		t = new Thread(this, thread);
		t.start();
	}

	public void run() {
		try {
			System.out.println(thread + ": Square is " + num * num);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception Occurred!! " + e);
		}
	}
}

class Cube implements Runnable {
	Thread t;
	String thread;
	int num;

	Cube(int num, String thr) {
		this.num = num;
		thread = thr;
		t = new Thread(this, thread);
		t.start();
	}

	public void run() {
		try {
			System.out.println(thread + ": Cube is " + num * num * num);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception Occurred!! " + e);
		}
	}
}

class Generate implements Runnable {
	Thread t;
	String thread;

	Generate(String thr) {
		thread = thr;
		t = new Thread(this, thread);
		t.start();
	}

	public void run() {
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
			try {
				int num = rd.nextInt(10);
				System.out.println(thread + ": Number: " + num);
				if (num % 2 == 0) {
					Square sq = new Square(num, "Thread 2");
				} else {
					Cube cb = new Cube(num, "Thread 3");
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception Occurred!! " + e);
			}
		}
	}
}

public class Even_oddThread {
	public static void main(String args[]) {
		Generate g1 = new Generate("Thread 1");
	}
}