package first;

import java.util.ArrayList;
import java.util.Scanner;

public class StarePath {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your stare number");
		int N=sc.nextInt();
		ArrayList<String>path=satrepath(N);
		System.out.println(path);

	}
	public static ArrayList<String>satrepath(int N)
	{
		if(N==0)
		{ArrayList<String>retbase=new  ArrayList<String>();
		retbase.add("");
		return retbase;
		}
		if(N<0)
		{
			return new  ArrayList<String>();
		}
		
		ArrayList<String> paths1=satrepath(N-1);
		ArrayList<String> paths2=satrepath(N-2);
	    ArrayList<String> paths3=satrepath(N-3);
		
	    ArrayList<String>ret=new  ArrayList<String>();
	    for(String val:paths1)
	    	ret.add("1"+val);
	    for(String val:paths2)
	    	ret.add("2"+val);
	    for(String val:paths3)
	    	ret.add("3"+val);
	    	
		
		return ret;
	}

}
