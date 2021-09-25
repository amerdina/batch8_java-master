package day28_encapsulation;

public class CaptalOne {

	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount();
		
		ba.getInfo();
		
		ba.accountName="Nadia";
		ba.accountName= "89798776";
		
		ba.showBalance();
		
		ba.deposite(4000);
		ba.getInfo();
		
		ba.deposite(4000);
		ba.getInfo();
		
		ba.withdraw(40000);
		ba.showBalance();
		
		
		
		
		
		
		
	}

}
