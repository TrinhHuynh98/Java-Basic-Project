package pkg.STD;
import java.util.*;

public class WithdrawTransaction extends ATMtransaction {
	Scanner sc = new Scanner(System.in);
	
	public boolean Login() {
		SavingAccount s = new SavingAccount();
		s.read();
		CurrentAccount c = new CurrentAccount();
		c.read();
	
		System.out.println("Enter Card Number: ");
		String a = sc.nextLine();
		for(int i=0;i<AppBank.i;i++) {
			if(a.equals(s.AccNo[i])==true) {
				System.out.println("Saving Account Balance: "+SavingAccount.Balance[i]);
				break;
			}
			else if(a.equals(s.AccNo[i])==true) {
				System.out.println("Current Account Balance: "+CurrentAccount.Balance[i]);
				break;
			}
		}
	
		System.out.println("The number to withdraw: ");
		int money = sc.nextInt();
		System.out.println("Account Balance: ");
		for(int i=0;i<AppBank.i;i++) {
			if(a.equals(s.AccNo[i])==true) {
				System.out.println(SavingAccount.Balance[i] - money);
				break;
			}
			else if(a.equals(s.AccNo[i])==true) {
				System.out.println(CurrentAccount.Balance[i] - money);
				break;
			}
		}
		
		}
		
		
}
