package com.tnsif.intro.practice;

public class Inheritance {
	 int age=34;
	   String name="sree";
public void show() {
   System.out.println(age+name);
 }
}
class Person extends Inheritance{
	int rollNo=3350;
	public void hide() {
	System.out.println(rollNo);
}
public static void main(String[] args) {
	Person in=new Person();
	in.show();
	in.hide();
 }
}
