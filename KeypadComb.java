package first;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadComb {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
    String a=sc.nextLine();
	
	ArrayList<String> als=keypad(a);
	System.out.println(als);
	System.out.println(als.size());

	}
	static String []alp= {" ","abc","def","ghij","klm","nopq","rst","uvw","xyz","?!@#"};
	public static ArrayList<String> keypad(String s)
	{
		if(s.isEmpty())
		{ArrayList<String> tempret=new ArrayList<String>();
		tempret.add("");
		return tempret;
		
		}
		
	char c=s.charAt(0);
	String temp1=alp[c-48];
	String rem=s.substring(1);
	ArrayList<String> ret=new ArrayList<String>();
	ArrayList<String> temp=keypad(rem);
	for(int i=0;i<temp1.length();i++)
	{
		for(String val:temp)
		{
			ret.add(temp1.charAt(i)+val);
		}
		
	}
		
		return ret;
		
	}

}
