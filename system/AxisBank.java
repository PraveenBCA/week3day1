package org.system;

public class AxisBank extends BankInfo{
		public  void deposit()
		{
		System.out.println(" overriding ac");
		}

	public static void main(String[] args)

	{
		AxisBank B = new AxisBank();
		B.saving();
		B.fixed();
		B.deposit();	
}
}