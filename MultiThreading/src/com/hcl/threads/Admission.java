package com.hcl.threads;

public class Admission implements Runnable {

	static int seats = 1;
	
	
	public static void main(String[] args) {


		
		System.out.println("Welcome to Engineering admission counselling");
		System.out.println("No. of seats available "+seats);
		
		
		Runnable ad = new Admission();
		
		
		
			Thread t1 = new Thread(ad);
		
			Thread t2 = new Thread(ad);
		
			t1.setName("Charan");
			t2.setName("Ramesh");
		
			// priority 5 rank
			
			t1.start();
			t2.start();
			
			
			
			
			
			

	}

	@Override
	public synchronized void run() {

			
			if(seats > 0) {
		
			System.out.println("Welcome "+Thread.currentThread().getName());
		
			System.out.println("Seat Allocated to "+Thread.currentThread().getName());
			
			seats --;
			
			System.out.println("No. of seats left "+seats);
		
			}
			
			else {
				
				System.err.println("Sorry "+ Thread.currentThread().getName() +" Try next year");
				
			}
			
			
	}

}
