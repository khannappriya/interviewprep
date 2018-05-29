package com.interviewprep.practicequestions;

import java.util.Scanner;

public class CheckStringSameCharacters {
	
	public static boolean CheckStringSameCharaters(String str, char strcompare)   // Method name should be in camelcase; here first letter should be lowercase
	{
		//String str;
		//char strcompare;
		//String strcompareString;
		//int result;
		int str_length;
		boolean outputresult = false;
		
		//Scanner scannerinput= new Scanner(System.in);
		//System.out.print("Please provide input string: ");
		//str=scannerinput.next();
		//System.out.print(str +"\n");
		str_length=  str.length();
		//System.out.print(str_length + "\n");
		
		strcompare=str.charAt(0);
	//	System.out.print(strcompare + "\n");
		
		for(int i=1;i<=(str_length)-1;i++)
		{
			if(strcompare == str.charAt(i))
				 //result = strcompareString.compareTo(str.valueOf(str.charAt(i)));
			//int result = strcompareString.compareTo(str);
			//if(result==0)
				{
					outputresult=true;
					//System.out.print(outputresult + "\n");
					//System.out.print(i + "\n");
				
				} 
			else
				{
					outputresult=false;
					//System.out.print(outputresult);
					//System.out.println("\n");
					break;
					
				}
		}
		return outputresult; 
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//@SuppressWarnings("resource")
		Scanner scannerinput= new Scanner(System.in);
		System.out.print("Please provide input string: ");
		 String thisinput = scannerinput.nextLine();
		 
		 System.out.println("You have entered string as: "+thisinput);
		 
		 char thisinputcompare= thisinput.charAt(0);
		
		boolean questionoutput= CheckStringSameCharaters(thisinput, thisinputcompare);
		
		if(questionoutput==true){
		System.out.println(questionoutput+" , the given input string has the same characters");
		}
		else {
			System.out.println(questionoutput+" , the given input string does not has the same characters");
			//System.out.print(questionoutput);
		}

		// Write a function in java that checks if a string has the same characters. Return True, if it has same characters. 
		// Eg. Return True if ssss; return False if xyz
		
		// Declare variable of type String
		
		
		
		/*
		
		String str = "Priya";         //String variables are implicitly stored as an array
		char strcompare;
		//String strcompareString;
		int str_length= str.length();
		boolean outputresult;
		System.out.print(str +"\n");
		
		System.out.print(str_length + "\n");
		
		//str.contentEquals(str);
		
		strcompare=str.charAt(0);
		System.out.print(strcompare + "\n");
		//strcompareString=String.valueOf(strcompare);
		//System.out.print(strcompareString);
		
		for(int i=0;i<=(str_length)-1;i++)
		{
			if(strcompare == str.charAt(i))
			//int result = strcompareString.compareTo(str);
			//if(result==0)
				{
					outputresult=true;
					System.out.print(outputresult + "\n");
					System.out.print(i + "\n");
				
				} 
			else
				{
					outputresult=false;
					System.out.print(outputresult);
					System.out.println("\n");
					break;
					
				}
		}
		
		
		
		
	}
	
	*/
		
	}

}
