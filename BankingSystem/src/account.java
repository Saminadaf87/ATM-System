import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class account {
	
	Scanner sc=new Scanner(System.in);
	
	
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer>data = new HashMap<Integer,Integer>();
	
	
	public  int setcustomerno(int customernum) {
		this.customerno = customernum;
		return customernum;
	}
	public int getCustomerno() {
		return customerno;
	}
	public int setpinno(int pinNo) {
		this.pinno = pinNo;
		return pinno;
	}
	public int getpinno() {
		return pinno;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}	
		
	public double calcheckingwithdraw(double amount) {
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
		
	}
	
	public double calSavingwithdraw(double amount) {
		savingBalance=(savingBalance-amount);
		return savingBalance;
		
	}
	
	public double calcheckingDeposit(double amount) {
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
		
	}
	
	public double calSavingDeposit(double amount) {
		savingBalance=(savingBalance+amount);
		return savingBalance;
		
	}
	
	public void getcheckingWithdraw() {
		System.out.println("Checking accout balance"+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from from checking accout :");
		double amount =sc.nextDouble();
		
		if((checkingBalance-amount)>=0) {
			calcheckingwithdraw(amount);
			System.out.println(" new checking accout balance:"+ moneyFormat.format(checkingBalance));
			}
		else
		{
			System.out.println("balance cannot be negative"+"/n");
		}
		
		}
	
	public void getsavingWithdraw() {
		System.out.println("saving accout balance"+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from from saving account :");
		double amount =sc.nextDouble();
		
		if((savingBalance-amount)>=0) {
			calSavingwithdraw(amount);
			System.out.println(" new checking accout balance:"+ moneyFormat.format(checkingBalance));
			}
		else
		{
			System.out.println("balance cannot be negative"+"/n");
		}
		}
	
	
	public void getcheckingDeposit() {
		System.out.println("Checking accout balance"+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from from checking accout :");
		double amount =sc.nextDouble();
		
		if((checkingBalance+amount)>=0) {
			calcheckingDeposit(amount);
			System.out.println(" new checking accout balance:"+ moneyFormat.format(checkingBalance));
			}
		else
		{
			System.out.println("balance cannot be negative"+"/n");
		}
		
		}
	
	
	public void getsavingDeposit() {
		System.out.println("saving accout balance"+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from from saving account :");
		double amount =sc.nextDouble();
		
		if((savingBalance+amount)>=0) {
			calSavingDeposit(amount);
			System.out.println(" new checking accout balance:"+ moneyFormat.format(checkingBalance));
			}
		else
		{
			System.out.println("balance cannot be negative"+"/n");
		}
		}
	public void newAccount() {
		System.out.println("welcome to my bank");
		System.out.println("enter account no");
		int a=sc.nextInt();
		System.out.println("enter pin no");
		int b=sc.nextInt();
		data.put(a, b);
		
	}
	
	
	private int customerno;
	private int pinno;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	
	
	
	
	

}
