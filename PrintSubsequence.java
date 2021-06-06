package first;

import java.util.Scanner;

public class PrintSubsequence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String input=sc.next();
		printsub(input,"");

	}
public static void printsub(String input,String output )

{
	if(input.isEmpty())
	{
		System.out.print(output+" , ");
         return;
	}
	char ch=input.charAt(0);
	String temp=input.substring(1);
	
	printsub(temp,output+ch);
	printsub(temp,output);
	
	
}
}
