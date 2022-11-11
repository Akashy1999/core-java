package interview.com;

public class BankAc {
	String Name;
	String ifscCode;
	long Accountnumber;
	String branch;
	public double balance;
	public double deposit(double balance) {
		this.balance=this.balance+balance;
		return this.balance;

	}
	public double withdrow(double balance) {
		this.balance=this.balance-balance;

		return this.balance;
	}
	public void transfer(double amount,BankAc frdsac) {
		System.out.println("transfering to frinds account ");
		withdrow(amount);
		
		frdsac.deposit(amount);
		System.out.println("transfering done ......tranbscation suessfully");
	}
}