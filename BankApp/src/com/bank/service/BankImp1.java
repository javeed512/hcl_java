package com.bank.service;

/*
 * @Author: Charan
 * Date: 29-10-2022
 */
		
		

public abstract class BankImp1  implements IBank{

	@Override
	public void deposit() {
		
		System.out.println("Deposit successful!");
		
	}

	@Override
	public void withdraw() {

		System.out.println("Withdraw successful!");
		
	}

	
	public abstract void fundTransfer();
	
	

}
