package pkg.STD;

public class CheckBalance extends ATMtransaction {	
	public void QueryProcessing() {
		SavingAccount s=new SavingAccount();
		s.read();
		//s.out();
		CurrentAccount c=new CurrentAccount();
		c.read();
		System.out.println("Enter Card Number: ");
		String a = sc.nextLine();
		for(int i=0;i<AppBank.i;i++) {
			if(a.equals(s.AccNo[i])==true) {
				System.out.println("Account Type: "+SavingAccount.AccType[i]);
				System.out.println("Account Balance = "+SavingAccount.Balance[i]+" + 5% Account Balance = "+(SavingAccount.Balance[i]+SavingAccount.Balance[i]*5/100)+"$");
				break;
			}
			else if(a.equals(c.AccNo[i])==true) {
				System.out.println("Account Type: "+CurrentAccount.AccType[i]);
				System.out.println("Account Balance: "+CurrentAccount.Balance[i]+"$");
				break;
			}
		}
	}
}
