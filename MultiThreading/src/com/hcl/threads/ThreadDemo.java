package com.hcl.threads;

public class ThreadDemo extends Thread {

	public static void main(String[] args) { // main-thread or Jvms thread or Demon thread

		// System.out.println("Welcome to Main");

		ThreadDemo td = new ThreadDemo();

		td.setPriority(10);
		td.setName("child1");
		
		ThreadDemo td2 = new ThreadDemo();

		td2.setPriority(10);
		td2.setName("child2");

		// System.out.println(td);

		// System.out.println(Thread.currentThread());

		td.start(); // internally td.run()
		td2.start(); // internally td2.run()

		/*
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * System.out.println("Main Thread");
		 * 
		 * }
		 */
	}

	public void run() {

		// System.out.println("Child Thread");
		// System.out.println(Thread.currentThread());

		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName());

		}

	}

}
