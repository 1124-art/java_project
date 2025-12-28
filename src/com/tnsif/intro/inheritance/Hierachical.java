package com.tnsif.intro.inheritance;

public class Hierachical {
  public void accountType() {
	  System.out.println("This is bank account");
	  
  }
}
class SavingsAccount extends  Hierachical{
	public void interest() {
		  System.out.println("This is bank account");
		  
	  }
}
class CurrentAccount extends Hierachical{
public void overdraft() {
	  System.out.println("This is bank account");
	  
}
public static void main(String[] args) {
	CurrentAccount ca=new CurrentAccount();
	ca.accountType();
	ca.overdraft();
	SavingsAccount sa=new SavingsAccount();
	sa.accountType();
	sa.interest();
}
}
