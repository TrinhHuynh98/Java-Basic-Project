package pkg.STD;
import java.util.*;
public class Account {
	Scanner sc = new Scanner(System.in);
	String Type,OwnedBy,BranchLocation;
	ATMtransaction a = new ATMtransaction();
	public Account() {
		Type=OwnedBy=BranchLocation=null;
	}
	public void AccMenu() {
		do {
			System.out.println("/****************************************/\r\n" + 
					"1. Edit Customer Account.\r\n" +  
					"2. Show Customer Account Information.\r\n" +
					"3. Withdraw Cash.\r\n" +
					"4. Deposit Cash.\r\n" +
					"5. ATM Transaction Option.\r\n" +
					"0. Exit.\r\n" + 
					"/****************************************/");
			
			int in = sc.nextInt();
			if(in==1) Update();
			else if(in==2) DisplayAccInfo();
			else if(in==3) Withdraw();
			else if(in==4) DepositCash();
			else if(in==5) a.Modify();
			else if(in==0) {
				System.out.println("....Exited....");
				break; 
			}
			else;
		}while(true);
	}
	public void Update() {
		sc.nextLine();
		String id;
		System.out.println("Enter Card Number: ");
		id = sc.nextLine();
		for(int i=0;i<AppBank.i;i++) {
			if(id.equals(Bank.b[i].cList[i].dList[i].CardNO)==true) {
				System.out.println("What kind of Account do you want to create?(Saving/Current)");
				String s=sc.nextLine();
				if(s.equals("Saving")==true) {
					Bank.b[i].cList[i].acc.Type="Saving Account";
					System.out.println("Successful!\n");
					
				}
				else if(s.equals("Current")==true) {
					Bank.b[i].cList[i].acc.Type="Current Account";
					System.out.println("Successful!\n");
				}
				System.out.println("Change Password? (Y/N)");
				s=sc.nextLine();
				if(s.equals("Y")==true) {
					Customer.dbpass[i] = sc.nextLine();
					System.out.println("Successful!");
				}
				}
	}
}
	public void DisplayAccInfo() {
		System.out.println("Enter Card Number: ");
		sc.nextLine();
		String a = sc.nextLine();
		for(int i=0;i<AppBank.i;i++) {
			if(a.equals(Bank.b[i].cList[i].dList[i].CardNO)==true) {
				System.out.println("/****************************************/");
				System.out.println("	Card Owned By: "+Bank.b[i].cList[i].Name);
				System.out.println("	Bank Account Ownership: "+Bank.b[i].cList[i].acc.Type);
				System.out.println("	Card Number: "+Bank.b[i].cList[i].dList[i].CardNO);
				System.out.println("	Password: "+Customer.dbpass[i]);				
				System.out.println("/****************************************/");
				break;
			}
		}
	}	
	public void Withdraw() {
		sc.nextLine();
		System.out.println("Welcome to ATM Withdraw Function\nPlease Login to continue!");
		System.out.println("Enter user name: ");
		String input = sc.nextLine();
		System.out.println("Enter password: ");
		String pwd = sc.nextLine();
		for(int i=0;i<AppBank.i;i++) { 
			if((input.equals(Bank.b[i].cList[i].dList[i].CardNO)==true)&&(pwd.equals(Customer.dbpass[i])==true)) {
				System.out.println("Login successful!");
				System.out.println("---------------Welcome---------------");
				if(Bank.b[i].cList[i].acc.Type.equals("Saving Account")) {
					System.out.println("Please Enter Amount of mouney you want to Withdraw: ");
					if (SavingAccount.Balance[i]==0) {
						System.out.println("Not enough cash to perform!");
						break;
					}
					else {
						float a = sc.nextFloat();
						SavingAccount.Balance[i]-=a;
						System.out.println(SavingAccount.Balance[i]);
						System.out.println("Successful!");
						break;
					}
				}
				else if(Bank.b[i].cList[i].acc.Type.equals("Current Account")) {
					System.out.println("Please Enter Amount of mouney you want to Withdraw: ");
					if(CurrentAccount.Balance[i]==0) {
						System.out.println("Not enough cash to perform!");
						break;
					}
					else {
					float a = sc.nextFloat();
					CurrentAccount.Balance[i]-=a;
					System.out.println("Successful!");
					break;
					}
				}
			}
		}
	}
	
	public void DepositCash() {
		sc.nextLine();
		System.out.println("Welcome to ATM Deposit Function\nPlease Login to continue!");
		System.out.println("Enter user name: ");
		String input = sc.nextLine();
		System.out.println("Enter password: ");
		String pwd = sc.nextLine();
		for(int i=0;i<AppBank.i;i++) { 
			if((input.equals(Bank.b[i].cList[i].dList[i].CardNO)==true)&&(pwd.equals(Customer.dbpass[i])==true)) {
				System.out.println("Login successful!");
				System.out.println("---------------Welcome---------------");
				if(Bank.b[i].cList[i].acc.Type.equals("Saving Account")) {
					System.out.println("Please Enter Amount of mouney you want to Deposit: ");
					float a = sc.nextFloat();
					SavingAccount.Balance[i]+=a;
					System.out.println(SavingAccount.Balance[i]);
					System.out.println("Successful!");
					break;
				}
				else if(Bank.b[i].cList[i].acc.Type.equals("Current Account")) {
					System.out.println("Please Enter Amount of mouney you want to Deposit: ");
					float a = sc.nextFloat();
					CurrentAccount.Balance[i]+=a;
					System.out.println("Successful!");
					break;
				}
			}
		}
	}
}
