package day7;

class Mul5 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("hi");
		}
	}
}

class Mul6 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("hello");
		}
	}
}

public class MultiThreadingThree {
	public static void main(String[] args) {
		Mul5 m5=new Mul5();
		Mul6 m6=new Mul6();
		m5.start();
		m6.start();
	}
}
