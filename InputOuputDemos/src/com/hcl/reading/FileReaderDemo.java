package com.hcl.reading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
	
		FileReader reader = null;
		FileWriter writer = null;
		
				try {
					reader = new FileReader("input.txt");
					
					writer = new FileWriter("output.txt", true);
					
					int n =0;
					
					while( (n =	reader.read()) != -1) {
					
						System.out.print((char)n);
						
					//writer.write(n);
						
						writer.append((char)n);
						
						writer.flush();// to flush data forcefully
						
						
					}
					
					
					
					
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					
					try {
						reader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
		
		
	}

}
