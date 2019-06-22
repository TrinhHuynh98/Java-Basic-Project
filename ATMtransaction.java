package pkg.STD;
import java.util.*;

public class ATMtransaction {
	Scanner sc = new Scanner(System.in);
	public boolean Login() {
		boolean check=false;
		System.out.println("Enter user name: ");
		String input = sc.nextLine();
		System.out.println("Enter password: ");
		String pwd = sc.nextLine();
		for(int i=0;i<AppBank.i;i++) { 
			if((input.equals(Bank.b[i].cList[i].dList[i].CardNO)==true)&&(pwd.equals(Customer.dbpass[i])==true)) {
				check=true;
				System.out.println("Login successful!");
			System.out.println("---------------Welcome---------------");
			break;
			}
			else {
				System.out.println("Fail to Login");
				continue;
			}
		}
		return check;
	}
	
	public void Modify() {
		sc.nextLine();
		if(Login()==false) {
			System.out.println("----------------Access Denied----------------");
		}
		else {
			do {
				System.out.println("/****************************************/\r\n" + 
						"1. Check Balance.\r\n" + 
						"0. Exit.\r\n" + 
						"/****************************************/");
				
				int in = sc.nextInt();
				if(in==1) {
					CheckBalance c = new CheckBalance();
					c.QueryProcessing();
				}
				else if(in==0) {
					System.out.println("....Exited....");
					break; 
				}
				else;
			}while(true);
		}
	}
	
}
