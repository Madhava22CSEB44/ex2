import java.util.Scanner;


public class Account {
	private  String id;
	private  String name;
	private int balance=0;
	
	public Account(String id,String name)
	{
		this.id=id;
		this.name=name;
    }
	public Account(String id,String name,int balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
    }
	public String getID()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public int getBalance()
	{
		return this.balance;
	}
	public int credit(int amount)
	{
		this.balance=this.balance+amount;
		return balance;
		
	}
	public int debit(int amount)
	{
		int b=this.balance;
		if (amount<=b)
		{
			this.balance=balance-amount;
		}
		else
		{
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public int transferto(Account account,int amount)
	{
		int b=this.balance;
		if (amount<=b)
		{
			
			account.balance=account.balance+amount;
		}
		else
		{
			System.out.println("Amount exceeded balance");
		}
		return account.balance;
	}
	public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account[] accounts = new Account[2];

        for (int i = 0; i < accounts.length; i++) {
            System.out.print("Enter account ID: ");
            String accountId = scanner.nextLine();

            System.out.print("Enter account holder's name: ");
            String accountName = scanner.nextLine();

            System.out.print("Enter initial account balance: ");
            int initialBalance = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            accounts[i] = new Account(accountId, accountName, initialBalance);
        }

        for (Account account : accounts) {
            System.out.println("Account details:");
            System.out.println(account);

            account.credit(500);
            account.debit(200);
            account.transferto(accounts[1], 100);
            System.out.println(account);

        }

        scanner.close();
    }
	
}
