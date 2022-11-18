package com.hcl.builder;

public class Main {

	public static void main(String[] args) {


		//create builder class object 
		
		
		TabBuilder builder = new TabBuilder();
		
		TabType tab1 =	 builder.build("Lenovo");    //builder.buildLenovoTab();
		
			tab1.getCosts();
			tab1.showItems();
			
				
			TabType tab2 =	 builder.build("MICROMAX");        //builder.buildMicromaxTab();
			
			tab2.getCosts();
			tab2.showItems();
			
					
		

	}

}
