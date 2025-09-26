package com.threads.basic;

public class Child extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+"..."+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("In main thread");
		Child child1 = new Child();
		child1.setName("Child-0");
		child1.setPriority(NORM_PRIORITY + 1);
		child1.start();

		Child child2 = new Child();
		child2.setName("Child-1");
		child2.setPriority(NORM_PRIORITY + 1);
		child2.start();
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+"..."+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
