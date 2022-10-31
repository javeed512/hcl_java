package com.bank.presentation;

import java.util.Scanner;

import com.bank.service.IBank;

/*
 * @Author: Johnson
 * Date: 31-10-2022
 */

public class Client {

	public static void main(String[] args) {

		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		
			IBank b =	Util.getObject(); // abstraction
		
		while (flag) {

			System.out.println("******WELCOME TO ATM*****");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. FundTransfer");
			System.out.println("4. Logout/Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				// logic to call deposit

				
						b.deposit();
				break;

			case 2:
				
				// logic to call withdraw
				
						b.withdraw();
				break;
			case 3:

					// logic for fundtransfer
				
					b.fundTransfer();
				
				break;
				
			case 4:
				
						flag =false;
						
						System.out.println("Thank You , Visit Again..");
				
				break;	

			default:
				
				System.err.println("INVALID INPUT");
				break;
			}

		}

	}

}
