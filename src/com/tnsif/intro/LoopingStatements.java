package com.tnsif.intro;
class LoopingStatements{
	
		public static  void evenNumbers() {
		//for loop
		//to print even numbers
		for(int i=2;i<10;i+=2) {
			System.out.println("evenNumbers are:"+ i);
		}
		 
	}
		public static void oddNumbers() {
			//while loop
			//printing odd numbers
			int j=1;
			while(j<10) {
				j+=2;
				System.out.println("odd numbers are:"+j);
			}
		}
		public static void Numbers() {
		//printing numbers 1 to 5
		        int i = 1;

		        do {
		            System.out.println(i);
		            i++;
		        } while (i <= 5);
		    }
		

		public static void main(String[]args) {
			evenNumbers();
			oddNumbers();
			Numbers();
	}

}
