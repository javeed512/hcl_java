package com.hcl.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

			
			FileInputStream  fis = null;
			
			FileOutputStream fos = null;
			
				try {
					
					
					fis = new FileInputStream("input.txt");
					
					fos = new FileOutputStream("output.txt");
					
					int n =0;
					
					while((n=fis.read()) != -1) {
						
						
						System.out.print((char)n);
						
						fos.write(n);
						
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
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
		
		
		
	}

}
