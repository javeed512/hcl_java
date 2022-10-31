package com.hcl.products;

public class Laptop {

	public static void main(String[] args) {

			System.out.println("Welcome to HCL Laptop");
		
				// assemble Hard Disk
		

		HardDisk  hd = new KingstonHD();
		
			System.out.println(hd.hdBrand());
			System.out.println(hd.hdSize());
			
			
	}

}
