package com.hcl.oops;

import java.util.Scanner;

public class Test {

	EmployeeDAOImp dao = new EmployeeDAOImp();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("**WELCOME**");
		System.out.println("Login Here");

		System.out.println("Enter User Name");
		String username = scanner.next();

		System.out.println("Enter Password");
		String password = scanner.next();

		Test test = new Test();

		boolean isUserValid = test.validateUserLogin(username, password);

		if (isUserValid) {

			System.out.println("Book Menu");

			getBookMenu();

		} else {

			System.err.println("Invalid user credentials..");

		}

	}

	public boolean validateUserLogin(String username, String password) {

		boolean isExist = false;

		Employee[] empList = dao.getAllEmployees();

		for (Employee employee : empList) {

			if (employee.getEname().equals(username) && employee.getPassword().equals(password))

			{

				isExist = true;

			}

		}

		return isExist;

	}

	public static void getBookMenu() {

		System.out.println("*****WELCOME TO BOOK MENU*****");

		boolean flag = true;

		// IBookDao bookDao = new BookDaoImp();

		while (flag) {

			System.out.println("1. New Books");
			System.out.println("2. Favourite Books");
			System.out.println("3. Completed Books");
			System.out.println("0. Exit");

			Scanner scanner = new Scanner(System.in);

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				// Books newBooks[] = bookDao.getAllNewBooks();

				System.out.println("i.Show All New Books");
				System.out.println("ii. Get Book By Id");
				String key = scanner.next();
				switch (key) {
				case "i":

						System.out.println("All new Books displayed");
					
					/*
					 * for (Book book : newBooks) {
					 * 
					 * System.out.println(book); }
					 */

					break;

				case "ii":

					System.out.println("Enter Book Id");

					int id = scanner.nextInt();

					/*
					 * for (Book book : newBooks) {
					 * 
					 * if(book.getBookId() == id){
					 * 
					 * System.out.println(book); } else{ System.err.println("Sorry, Book Not found")
					 * 
					 * }
					 * 
					 * }
					 */
							System.out.println("Book by id displayed");
					break;

				
				}// inner switch-1 ends

				break;
			case 2:

				// fav books

				break;
			case 3:

				// completed books

				break;

			default:
				break;
			}

		}

	}

}
