import java.io.IOException;
import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class optionmeneu extends account {
	Scanner menuInput = new Scanner (System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	
	public  void getAccountType() {
		System.out.println("select the account you want to access:");
		System.out.println("type 1: checking account");
		System.out.println("type 2: saving account");
		System.out.println("type 3: New Account");
		System.out.println("type 4: exit");
		System.out.println("choise :");
		
		selection =menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
		case 2:
		    getSaving();
		    break;
		case 3:
		    newAccount();
		    break;
		case 4:
			System.out.println("Thanks for visiting");
			break;
		    
		}
	}
	
	public void getlogin() throws IOException{
		int x=1;
		
		do {
			try {
				data.put(123, 1234);
				System.out.println("welcome to the atm  ");
				System.out.println("entre your customer number:");
				setcustomerno(menuInput.nextInt());
				System.out.println("entre your pin number:");
				setpinno(menuInput.nextInt());
			}catch(Exception e) {
				System.out.println("\n"+"invalid char");
				x=2;
			}
			for(java.util.Map.Entry<Integer,Integer> entry : data.entrySet()) {
				if (entry.getKey()==getCustomerno() && entry.getValue()==getpinno()) {
					getAccountType();
				}
				
			}
			System.out.println("\n"+"wrong coustemer data");
		}while(x==1);
	}
	
	
	   
	  
	public void getChecking() {
		System.out.println("checking account");
		System.out.println("type 1: view balance");
		System.out.println("type 2: withdraw funds");
		System.out.println("type 3: deposit funds");
		System.out.println("type 4: exit");
		System.out.println("choise :");
		
		selection =menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("checking account balance :"+ moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getcheckingWithdraw();
			getAccountType();
			
		    break;
		case 3:
			getcheckingDeposit(); 
			getAccountType();
			 break;
		case 4:
			System.out.println("thanks for visiting");
			break;
		    
		}
	   
	  }
	
	
	public void getSaving() {
		System.out.println("saving account");
		System.out.println("type 1: view balance");
		System.out.println("type 2: withdraw funds");
		System.out.println("type 3: deposit funds");
		System.out.println("type 4: exit");
		System.out.println("choise :");
		
		selection =menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("checking account balance :"+ moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getsavingWithdraw();
			getAccountType();
			
		    break;
		case 3:
			getsavingDeposit();
			getAccountType();
			 break;
		case 4:
			System.out.println("thanks for visiting");
			break;
		    
		}
	   
	  }
	int selection;

}
