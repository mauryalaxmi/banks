
public class BankAccount {
	int acno;
	String name;
	int balance;
	
	public BankAccount(int acno,String name,int balance) {
		this.acno=acno;
		this.name=name;
		this.balance=balance;	
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount)
	{
		balance+=amount;
	}
		public void withdraw(int amount) {

		balance-=amount;
		}

	
}
