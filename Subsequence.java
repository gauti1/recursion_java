package first;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
	ArrayList<String> alst=printsub(st);
	System.out.println(alst);
	System.out.println(alst.size());

	}
	public static ArrayList<String> printsub(String s)
	{
		if(s.length()==0)
	    {
			ArrayList<String> base=new ArrayList<String>();
			base.add("");
//			base.add(s);
			return base;
			
	    }
		ArrayList<String> temp=printsub(s.substring(1));
		ArrayList<String> temp2=new ArrayList<String>();
		for(String val:temp)
		{temp2.add(val);
		temp2.add(s.charAt(0)+val);
		}
	return temp2;
		
	}

}
