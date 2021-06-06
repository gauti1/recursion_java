package first;

import java.util.Scanner;

public class PermutationString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		sc.close();
		printpermutation(s,"");
	}
public static void printpermutation(String s,String Op)
{
	if(s.length()==0)
     {
		System.out.print(Op+" , ");
		return;
	 }
	for(int i=0;i<s.length();i++)
	{
//		printpermutation(s.replaceFirst(s.charAt(i)+"", ""),Op+s.charAt(i));
		
		printpermutation(s.substring(0,i)+s.substring(i+1),Op+s.charAt(i));
	}
	
}
}
