package com.hcl.reading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromKB {

	public static void main(String[] args) {


BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			try {
				
				System.out.println("Enter name");
				
				String name  = br.readLine();
				
				System.out.println(name);
				
				System.out.println("Enter Amount"); // "5000"
				
				int amount =  Integer.parseInt(br.readLine());
				
				System.out.println(amount+100);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		System.out.println();
	}

}
