package pkg.STD;
import java.util.Scanner;

public class AppBank {
	static int i=0;
	Scanner sc = new Scanner(System.in);
	public void Display() {
		for(int j=0;j<i;j++) {
			System.out.println("----------Thong tin Khach Hang----------");
			System.out.println("\nCustomer "+(j+1)+" name: "+Bank.b[j].cList[j].Name);
			System.out.println("Customer "+(j+1)+" Address: "+Bank.b[j].cList[j].Address);
			System.out.println("Customer "+(j+1)+" ID: "+Bank.b[j].cList[j].ID);
			System.out.print("Using Bank: "+Bank.b[j].Bname);
			System.out.println(" with ID "+Bank.b[j].BankID+" at "+Bank.b[j].Location);
			System.out.println();
			}
	}
	
	public void AddCustomer() {
		Bank.b[i] = new Bank();
		Bank.b[i].cList[i] = new Customer();
		sc.nextLine();
		System.out.println("Enter Bank name: ");
		Bank.b[i].Bname = sc.nextLine();
		System.out.println("Enter Customer Bank ID: ");
		Bank.b[i].BankID = sc.nextLine();
		System.out.println("Enter Bank Location: ");
		Bank.b[i].Location = sc.nextLine();
		System.out.println("Enter Customer Name: ");
		Bank.b[i].cList[i].Name=sc.nextLine();
		System.out.println("Enter Customer Address: ");
		Bank.b[i].cList[i].Address = sc.nextLine();
		System.out.println("Enter Customer ID: ");
		Bank.b[i].cList[i].ID=sc.nextLine();
		i++;
	}
	public void RemoveCustomer() {
		sc.nextLine();
		String s ;
		System.out.println("Enter customer id: ");
		s = sc.nextLine();
		for(int j=0;j<i;j++) {
			if(	s.equals(Bank.b[j].cList[j].ID) == true) {
			System.out.println("Do you want to remove this account?\n");
			System.out.println("----------Thong tin Khach Hang----------");
			System.out.println("\nCustomer "+(j+1)+" name: "+Bank.b[j].cList[j].Name);
			System.out.println("Customer "+(j+1)+" Address: "+Bank.b[j].cList[j].Address);
			System.out.println("Customer "+(j+1)+" ID: "+Bank.b[j].cList[j].ID);
			System.out.print("Using Bank: "+Bank.b[j].Bname);
			System.out.println(" with ID "+Bank.b[j].BankID+" at "+Bank.b[j].Location+"\n");
			String a=sc.nextLine();
			if(a.equals("Yes")) {
				for(int n=j;n<i-1;n++) {
					Bank.b[n]=Bank.b[n+1];
					Bank.b[n].cList[n]=Bank.b[n+1].cList[n+1];
				}
				System.out.println("\nSuccessful!");
				i--;
				break;
			}
			}
		}
	}
	public void Update() {
		sc.nextLine();
		String id;
		System.out.println("Enter customer id: ");
		id = sc.nextLine();
        for (int j = 0; j < i; j++) {
            if (id.equals(Bank.b[j].cList[j].ID)==true) {
                System.out.println("Enter Bank name: ");
        		Bank.b[j].Bname = sc.nextLine();
        		System.out.println("Enter Customer Bank ID: ");
        		Bank.b[j].BankID = sc.nextLine();
        		System.out.println("Enter Bank Location: ");
        		Bank.b[j].Location = sc.nextLine();
        		//sc.nextLine();
        		System.out.println("Enter Customer Name: ");
        		Bank.b[j].cList[j].Name=sc.nextLine();
        		System.out.println("Enter Customer Address: ");
        		Bank.b[j].cList[j].Address = sc.nextLine();
        		System.out.println("Enter Customer ID: ");
        		Bank.b[j].cList[j].ID=sc.nextLine();
                break;
            }
        }
	}
	
		
	
	public void Menu() {
		do {
			System.out.println("/****************************************/\r\n" + 
					"1. Add Customer.\r\n" + 
					"2. Edit Customer by id.\r\n" + 
					"3. Delete Customer by id.\r\n" +  
					"4. Show Customer List.\r\n" +
					"5. ATM Options.\r\n" +
					"0. Exit.\r\n" + 
					"/****************************************/");
			
			int in = sc.nextInt();
			if(in==1) AddCustomer();
			else if(in==2) Update();
			else if(in==3) RemoveCustomer();
			else if(in==4) Display();
			else if(in==5) Debit_Account();
			else if(in==0) {
				System.out.println("....Exited....");
				break; 
			}
			else System.out.println("Input Invalid! Retry!");;
		}while(true);
	}
	
	public void Debit_Account(){
		Bank b = new Bank();
		b.Manages();
		Account a=new Account();
		a.AccMenu();
		
	}
	public static void main(String[] Args)  {
		AppBank test = new AppBank();
		test.Menu();
	}
}
