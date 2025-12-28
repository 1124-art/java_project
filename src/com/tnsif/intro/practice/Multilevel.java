package com.tnsif.intro.practice;

public class Multilevel{
	public void show()
	{
		System.out.println("this is A class");
	}
}
class B extends Multilevel{
	public void show1()
	{
		System.out.println("this is B class");
	}
}
class C extends B{
	public void show2()
	{
		System.out.println("this is C class");
	}

	
	
}