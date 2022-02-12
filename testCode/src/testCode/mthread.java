package testCode;

class A extends Thread {

}

class B extends Thread {
	public void run() {
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B" + j);
			if (j == 3)
				try {
					stop();
					
				}
			catch(Exception e) {
				
			}
				
				
		}

	}
}

class C extends Thread {
	public void run() {
		for (int k = 1; k <= 5; k++) {
			System.out.println("\nFrom Thread C" + k);
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("\nEnd of Thread c");
		}
	}
}

public class mthread {
	public static void main(String[] args) {
		A aa = new A();

		System.out.println("Thraed A is being started");
		aa.run();
		B bb = new B();
		System.out.println("Thread B is being started");
		bb.run();
		C cc = new C();
		System.out.println("Thread C is being started");
		cc.run();

	}

}
