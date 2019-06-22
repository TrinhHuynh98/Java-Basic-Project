package pkg.STD;
import java.util.*;

public class Bank {
	String BankID, Location,Bname;
	public static Bank b[] = new Bank[100];
	public Customer cList[] = new Customer[100];
	DebitCard d = new DebitCard();
	Scanner sc = new Scanner(System.in);
	public Bank() {
		BankID = Location = Bname = null;
	}
	public void setAccount(Customer C) {
		
	}
	public void Manages()  {
		for(int x=0;x<AppBank.i;x++) {
			if(b[x].cList[x].acc.Type==null) {
		System.out.println("Create new DebitCard?(Yes/No)");
		String A=sc.nextLine();
		if(A.equals("Yes")==true) {
			b[x].cList[x].setDebitCard();
		System.out.println("Create new Bank Account with this DebitCard?(Yes/No)");
		String s=sc.nextLine();
		if(s.equals("Yes")==true) {
			System.out.println("What kind of Account do you want to create?(Saving/Current)");
			s=sc.nextLine();
			if(s.equals("Saving")==true) {
				b[x].cList[x].acc.Type="Saving Account";
				System.out.println("Successful!\n");
				
			}
			else if(s.equals("Current")==true) {
				b[x].cList[x].acc.Type="Current Account";
				System.out.println("Successful!\n");
			}
		}
		}
		}
	}
}
	public boolean Existed(Customer c) {
		boolean h = false;
		for(int i=0;i<AppBank.i;i++) {
			if(c.ID.equals(b[i].cList[i].ID)==true) h=true;
			}
		return h;
	}
}
