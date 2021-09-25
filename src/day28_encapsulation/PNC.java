package day28_encapsulation;

public class PNC {

	public static void main(String[] args) {
		
	BankAccount account=new BankAccount();
	
	account.accountName="Ariuna";
	
	account.accountNumber="334576543";
	
	account.showBalance();
	
	account.deposite(10000);
	
	account.showBalance();
	
	account.withdraw(5000);
	
	account.getInfo();
	
	
	
	
	
	
	
	
	}

}
