package com.hcl.threads;

public class ThreadDemo2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable td = new ThreadDemo2();
		
		Thread t = new Thread(td);
		
			t.setPriority(Thread.MAX_PRIORITY - 3);
			t.setName("child1");
		
			
			ThreadDemo2 td2 = new ThreadDemo2();
			
			Thread t2 = new Thread(td);
			
				t2.setPriority(7);
				t2.setName("child2");
			
			
			
		//System.out.println(t);
		
						t2.start();
						t.start();
		
		
	}

	@Override
	public  void run() {
	
		
		
	for(int i=0; i< 10; i++) {	
		System.out.println("This run() executed by "+Thread.currentThread().getName());
	
			
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 2-sec 
		
		
	}
		
	}

}
