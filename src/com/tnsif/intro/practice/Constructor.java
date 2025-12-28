package com.tnsif.intro.practice;

public class Constructor {
	int age;
	String name;
 //default cons  //both are overloading
Constructor (){
	  age=33;
	   name="chinu";
   }
//parameterized con
Constructor(int age,String name){
	this.age=age;
	this.name=name;
}
   public static void main(String[] args) {
	   Constructor cc=new Constructor ();
	   Constructor cc1=new Constructor (44,"chintu");
	   System.out.println("age"+ ":"+cc.age + " "+"name"+":"+cc.name);
	   System.out.println("age"+ ":"+cc1.age+" "+"name"+":"+cc1.name);
	   
	   
	   
	   
	   
   }
}
