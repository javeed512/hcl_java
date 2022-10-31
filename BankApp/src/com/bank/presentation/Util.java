package com.bank.presentation;

import com.bank.service.BankImp2;
import com.bank.service.IBank;

public class Util {

	
	public static IBank   getObject(){
		
		
		return new BankImp2();
		
		
	}
	
	
}

