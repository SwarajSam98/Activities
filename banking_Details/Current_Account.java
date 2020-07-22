package banking_Details;

import java.util.*;

public class Current_Account {
	public static double deposit, withdraw, balance;

	public static void main(String[] args) {
		boolean flag = false;
		balance = 10000;
		deposit = 0;
		withdraw = 0;
		char A;
		Scanner scanner = new Scanner(System.in);
		while (!(flag)) {
			System.out.println(
					"Do you want to deposit or withdraw from you Current account\n If you want to deposit press D If you want to withdraw place W");
			System.out.println("To check balance press B");
			A = scanner.next().charAt(0);
			switch (A) {
			case 'D':
				System.out.println("Enter the amount you want to deposit");
				deposit = scanner.nextDouble();
				balance = balance + deposit;
				System.out.println("New Balance after depositing = " + balance);
				break;
			case 'W':
				System.out.println("Enter amount to be withdraw");
				withdraw = scanner.nextDouble();
				if (withdraw > balance) {
					System.out.println("Your account is running in negative -" + (withdraw - balance));
				} else
					balance = balance - withdraw;
				System.out.println("New Balance after withdrawal =  " + balance);
				break;
			case 'B':
				System.out.println("Your Current Account Balance is: " + balance);
			default:
				System.out.println("Enter D or W for depositig or withdrawing from current account");
				break;

			}
			System.out.println(
					"If you want to step out of Current Account press T or press F if you want to deposit or withdraw amount");
			char F = scanner.next().charAt(0);
			if (F == 'T' || F == 't') {
				flag = true;
			} else
				flag = false;

		}
		System.out.println("Thank You for using our services");

	}
}
