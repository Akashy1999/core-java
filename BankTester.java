package interview.com;

public class BankTester {
	public static void main(String[] args) {
		BankAc a=new BankAc();
		a.Name="Akash";
		a.ifscCode="SBI1234";
		a.Accountnumber=212223333333l;
		a.branch="smg";
		System.out.println("name is "+a.Name);
		System.out.println("IfscCode is "+a.ifscCode);
		System.out.println("Accountnumber is "+a.Accountnumber);
		System.out.println("branch "+a.branch);
		a.deposit(1000);
		System.out.println("first amount deposited "+a.balance);
		a.deposit(10000);
		System.out.println("second amount deposited "+a.balance);
		a.withdrow(10000);
		System.out.println("amount withdrow and current balance ");
		System.out.println("amount withdrow and current balance "+a.balance);
		BankAc frdsac=new BankAc();
		frdsac.deposit(10000);
		System.out.println("friends Account balansce "+frdsac.balance);
		a.transfer(50, frdsac);
		System.out.println("my Account balansce "+a.balance);
		System.out.println("the friends account "+frdsac.balance);
		
	}

}
