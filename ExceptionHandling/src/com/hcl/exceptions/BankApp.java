package com.hcl.exceptions;

public class BankApp {

	public static void main(String[] args) {

		int account[] = { 101, 102, 103, 104, 105 };
		String names[] = { "javeed", "charan", "yashwanth", "tom", "smith" };

		double balance[] = { 50, 4000, 6000, 3000, 7000 };

		System.out.println("AccountNo Names Balance");

		for (int i = 0; i < account.length; i++) {

			System.out.println(account[i] + "  " + names[i] + "  " + balance[i]);

			if (balance[i] < 1000) {

				try {
					throw new LowBalanceException();
				} catch (LowBalanceException e) {

					System.err.println(names[i] + " Your balance is low, Please deposit min amount");

				}
			}

		}

	}

}
