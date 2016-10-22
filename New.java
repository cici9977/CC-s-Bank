class Account
{
	
	private String myName;
	private double myBalance;
	private boolean hasMoney = true;
	
	public Account(String str, double balance)
	{
		myName = str;
		myBalance = balance;
	}
	public String getName()
	{
		return myName;
	}
	
	public double getBalance()
	{
		return myBalance;
	}
	
	public double withdraw(double money)
	{
		if(hasMoney)
			return myBalance -= money;
		else
			return 0;
	}
	
	private void checkValid()
	{
		if(myBalance == 0)
			hasMoney = false;
	}
	
	public  void print()
	{
		System.out.println("I am the account class!");
	}	
	
}




 class CheckingAccount extends Account
{
	private static final double INTERST_RATE = 0.5;
	private static  double addtionalMoney = 2000.0;
	private static  int HowMany = 0;
	
	private Investment a;
	
	CheckingAccount(String name, double mon)
	{
		//howMany++;
		super(name, mon);//called是这个
		//HowMany++;
		a = new Investment("silver",500.0); //这里又添加了一个investment, need to be called
		
	}
	
	public double getInterest(int years)
	{
		return getBalance() * 10 *INTERST_RATE;
		//return INTERST_RATE += 0.2;
	}
	
	public int getHowMany()
	{
		return HowMany;
	}
	
	public static double getAdditionalMoney()
	{
		return addtionalMoney += 200.0;
	}
	
	public  void print()
	{
		System.out.println("I am the checkingAccount class!");
	}
	
	public String getInvestName() //负责return一个investment的name
	{
		return a.getName();
	}
	public double getInvestAmounts() //负责return一个investment的amount
	{
		return a.getAmounts();
	}
	
	
		
}
	
	
	
 
	
	
 class Investment
	{
		private String Name;
		private double Amounts;
		
		public Investment(String n, double a)
		{
			Name = n;
			Amounts = a;
			System.out.println("You have invested on "+ Name +" and it costs "+Amounts);
		}
		
		public String talk()
		{
			return"You have invested on "+ Name+" and it costs " + Amounts;
		}
		
		public void setName(String n)
		{
			Name = n;
			
		}
		public String getName()
		{
			return Name;
		}
		
		
		public void SetAmounts(double a)
		{
			Amounts = a;
		}
		
		public double getAmounts()
		{
			return Amounts;
		}
			
	}
 


public class New
{

	public static void main(String[] args) 
	{
		// TODO Auto-genezzzzrated method stub
		//CheckingAccount.getAdditionalMoney();
		//Account[] arr = new Account[2];
		
		 Account ac = new Account("Rachel", 200.0);
		 CheckingAccount ca = new CheckingAccount("CiCi", 5000.09);
		 
		 Investment vit = new Investment("Gold", 500.0);
		 
//		 ((CheckingAccount)ca).setInvest(vit);
//		 Investment b = ((CheckingAccount)ca).getInvest();
		 
		 
		 
//		 String nm = ((CheckingAccount)ca).getInvest();
//		 System.out.printf(%s\n, nm);
//		 System.out.println((CheckingAccount)ca).getInvest();
		 
		 
		 
		 System.out.println(vit.getName());
		 System.out.println(vit.getAmounts());
		 
		 System.out.println(vit.talk());
		 
		 
		 //override 
		 ((Account)ac).print();//cast
		 ac.print();
		 ((CheckingAccount)ca).print();//cast
		 ca.print();
		 
		 System.out.println(ac.getName());
		 System.out.println(ac.getBalance());
		 System.out.println(ca.getName());
		 System.out.println(ca.getBalance());

//		CheckingAccount ca1 = new CheckingAccount("Rachel", 6000.09);		
		ca.getAdditionalMoney();	//haven't printed
		
		System.out.println(ca.getAdditionalMoney());
//		
//		System.out.println(ca.getHowMany());
//		System.out.println(ca1.getHowMany());	
//		System.out.println(p.getName());
//		arr[0] = ac;
//		arr[1] = ca;
//		arr[0].print(); //the same
//		arr[1].print(); //the same


	}

}