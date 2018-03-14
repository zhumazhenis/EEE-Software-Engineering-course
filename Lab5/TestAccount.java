
/*
 * Done by Zhumazhenis Dairabay
 * ID: 201471247
 * Lab 5
 * Exercise 1
 */

import java.util.Date;

public class TestAccount {
	public static void main(String[] args) {
		
		Account account = new Account(1122, 20000); // crate object with id = 1122, balance = $20000
		account.setDate(new Date()); // set current date as account creation date
		Account.setAnnualInterestRate(4.5); // set Annual Interest Rate to 4.5%
		account.withdraw(2500); // withdraw $2500
		account.deposit(3000); // deposit $3000

		/* prints */
		System.out.println("Balance:\t\t$" + account.getBalance()); // current balance
		System.out.println("Monthly interest:\t$" + account.getMonthlyInterest()); // current Monthly Interest
		System.out.println("Account creation date:\t" + account.getDate()); // account creation date
	}
}
