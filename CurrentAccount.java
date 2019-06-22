package pkg.STD;

public class CurrentAccount extends Account {
	public String AccNo[]=new String[100];
	public static String AccType[]=new String[100];
	public static float Balance[]=new float[100];
	public void read() {
		for(int i=0;i<AppBank.i;i++) {
			if(Bank.b[i].cList[i].acc.Type.equals("Current Account")==true) {
				AccType[i]=Bank.b[i].cList[i].acc.Type;
				AccNo[i]=Bank.b[i].cList[i].dList[i].CardNO;
			}
		}
	}
}
