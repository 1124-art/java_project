package com.tnsif.intro.accessmodifier;

public class Student {
	

	

	    public int rollNo = 101;          // public
	    protected String name = "Ravi";   // protected
	    int marks = 85;                   // default
	    private String password = "abc123"; // private

	    public void display() {
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	        System.out.println("Password: " + password);
	    }
	}


