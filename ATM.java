import java.util.Scanner;
class ATM
{
	static Scanner sc=new Scanner(System.in);
	double balance=10000;
	int pin=1126;
	int c=0;
	public void checkpin()
	{         

		System.out.println(" ");
		System.out.print("Enter the Your pin : ");
		int a=sc.nextInt();
		
		        if(pin==a)
			{
				menu();
			}
			else
			{     
				 System.out.println(" ");
				System.out.print("Enter the Valid pin ");
				System.out.println(" ");
				c++;
				if(c<=4)
				checkpin();
				else
				System.out.println("Your Account has been Blocked ");
				System.out.println(" ");	
			}
	}
	public void menu()
	{
		System.out.println("Enter Your Choice : ");
		System.out.println("1.Check Balance  ");
		System.out.println("2.WithDram Amount  ");
		System.out.println("3.Deposit Amount  ");
		System.out.println("4.Transfer Amount  ");
		System.out.println("5.Quit ");
		System.out.println(" ");
		int c=sc.nextInt();	
		if(c==1)	
			checkBalance();
		else if(c==2)
			withDraw();
		else if(c==3)
			deposit();
		else if(c==4)
			transferAmount();
		else if(c==5)
			quit();
		else
			System.out.println("Enter The valid choice");
	}
	public void checkBalance()
	{
		System.out.println("Your Acount Balance is "+balance);	
		System.out.println(" ");
		menu();
	}
	
	public void withDraw()
	{
		System.out.print("Enter the Amount You Want to Withdraw");
		double w=sc.nextDouble();
		if(w<=balance)
		{
			balance=balance-w;
			System.out.println(w);
			System.out.println("Transaction Successful");
			System.out.println();
		menu();
		}
		else
		{
			System.out.println("Enter the Valid Amount");
			System.out.println(" ");
		menu();
		}
	}
	public void deposit()
	{
	System.out.println("Enter the amount You want to deposit");
	double d=sc.nextDouble();
		if(d>0)
		{	
		balance=d+balance;
		System.out.println("Transaction Successful");
		System.out.println(" ");
		}
		else
		{
		System.out.println("Enter the valid amount");
		System.out.println(" ");
		}
	menu();
	
	}
	public void transferAmount()
	{
	System.out.println("Enter the Account Number You want Transfer Amount");
	Double a=sc.nextDouble();
	System.out.print("Enter the Amount You want Transfer");
	Double m=sc.nextDouble();
	if(m<=0)
	{
		System.out.println("Enter the Valid Amount");	
		System.out.println(" ");
	}
	else
	{
		System.out.println("Transaction Successful ");
		System.out.println(" ");
	menu();
	}
	}
	public void quit()
	{
	System.out.print("Thank You");
	return ;
	}
	
public static void main(String[] args)
{
ATM obj=new ATM();
obj.checkpin();
}
}