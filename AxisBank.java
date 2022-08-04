package week3.day1;

public class AxisBank extends BankInfo
{
	//To create Method - deposit() 
		public void deposit()
		{
			System.out.println("Deposit in Axis Bank");
		}
		public static void main(String[] args) 
		{
			//Object creation
			AxisBank objAxis = new AxisBank();
			
			//Calling the methods from Class - BankInfo
			objAxis.saving();
			objAxis.fixed();
			
			//To override the method deposit() in Class - AxisBank
			objAxis.deposit();
		}
}
