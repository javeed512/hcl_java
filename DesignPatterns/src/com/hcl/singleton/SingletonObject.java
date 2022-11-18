package com.hcl.singleton;

public class SingletonObject {
	
	  //create an object of SingletonObject
	   private static SingletonObject obj;   
	 
	   //private constructor so that we cannot instantiate the class
	   private SingletonObject(){
		   
		   System.out.println("Singleton object created...");
		   
	   }
	 
	   //returns the only available object
	   public static SingletonObject getInstance(){
		   
		   if(obj == null) { // obj not exist or object not available
			   
			 obj  = new SingletonObject();
			   
		   }
		   
		   
	      return obj; // returns existing object or new object
	   }
	 
	   public void printMessage(){
	      System.out.println("Hello from Singleton object!!!");
	   }
	

}
