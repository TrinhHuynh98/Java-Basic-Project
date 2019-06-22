package pkg.STD;
import java.util.Random;
import java.util.*;
public class Customer {
	static int i=0;
	Scanner sc = new Scanner(System.in);
	String ID,Name,Address;
	public static String dbpass[]=new String[100];
	public DebitCard dList[]= new DebitCard[100]; 
	Account acc = new Account();
	public Customer() {
		
	}
	public void setDebitCard() {
		Random rand = new Random();
		int n = rand.nextInt(9999) + 1000;
		Bank.b[i].cList[i].dList[i] = new DebitCard();
		dbpass[i]=new String();
		Bank.b[i].cList[i].dList[i].CardNO= String.valueOf(n);
			System.out.println("Your Debit Card Number is: "+Bank.b[i].cList[i].dList[i].CardNO);
			System.out.println("Please enter new PIN to continue: ");
			dbpass[i] = sc.nextLine();
			System.out.println("Successful!");
			i++;		
	}
}
