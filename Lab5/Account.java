
/*
 * Done by Zhumazhenis Dairabay
 * ID: 201471247
 * Lab 5
 * Exercise 1
 */

import java.util.Date;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0; // static, because all Account objects shares the same annualInterestRate
	private Date dateCreated;

	/* default constructor */
	public Account() {
		
	}

	/* constructor with parameters id, balance */
	public Account(int i, int b) {
		id = i;
		balance = b;
	}

	/* setId sets id */
	public void setId(int i) {
		id = i;
	}

	/* setBalance sets balance */
	public void setBalance(int b) {
		balance = b;
	}

	/* setAnnualInterestRate sets annualInterestRate */
	public static void setAnnualInterestRate(double a) {
		annualInterestRate = a;
	}

	/* setDate sets dateCreated */
	public void setDate(Date d) {
		dateCreated = d;
	}

	/* getId gets id */
	public int getId() {
		return id;
	}

	/* getBalance gets balance */
	public double getBalance() {
		return balance;
	}

	/* getAnnualInterestRate gets annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/* getDate gets dateCreated */
	public Date getDate() {
		return dateCreated;
	}

	/* getMonthlyInterestRate gets annualInterestRate */
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	/* getMonthlyInterest gets monthly interest rate = balance * annualInterestRate / 12 / 100 */
	public double getMonthlyInterest() {
		return balance * annualInterestRate / 12 / 100;
	}

	/* withdraws w amount from balance */
	public void withdraw(double w) {
		balance -= w;
	}

	/* deposits */
	public void deposit(double d) {
		balance += d;
	}
}
