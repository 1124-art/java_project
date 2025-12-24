package com.tnsif.intro.accessmodifier;

public class Studenttest{
	
	

	    public static void main(String[] args) {

	        Student s = new Student();

	        System.out.println(s.rollNo);  // ✅ public
	        System.out.println(s.name);    // ✅ protected
	        System.out.println(s.marks);   // ✅ default
	        // System.out.println(s.password); // ❌ private (error)
	    }
	}
