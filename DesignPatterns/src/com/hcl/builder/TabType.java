package com.hcl.builder;

import java.util.ArrayList;
import java.util.List;

public class TabType {
	private List<Packing> items = new ArrayList<Packing>();
	
	
	//add items
	public void addItem(Packing pack) {
		
		items.add(pack);
		
		
	}
	
	// to get cost
	
		public void getCosts() {
			
			for (Packing pack : items) {
				
					pack.price();
				
			}
			
			
		}
	
		
		//show all items or all packs/brands
		
		public void showItems() {
			
			
				for (Packing packing : items) {
					
					System.out.println("Tablet Name/Pack Name : "+packing.pack());
					System.out.println("Tablet Price in USA $ "+packing.price());
					
					
				}
			
			
		}
		
		
	
	

}
