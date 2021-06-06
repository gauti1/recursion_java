package first;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathWithJmp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    System.out.println("enter source coordinate row col");
	    int sr=sc.nextInt();
	    int Sc=sc.nextInt();
	    System.out.println("enter destination coordinate row col");
	    int dr=sc.nextInt();
	    int dc=sc.nextInt();
		ArrayList<String> paths=getpthswthjmp(sr,Sc,dr,dc);
		System.out.println(paths);
		System.out.println(paths.size());

		
	}
	public static ArrayList<String>getpthswthjmp(int sr,int Sc,int dr,int dc)
	{
		if(sr==dr && Sc==dc)
		{
			ArrayList<String>tempret=new ArrayList<String>();
			tempret.add("");
			return tempret;
		}
		ArrayList<String>ret=new ArrayList<String>();
		
		for(int mc=1;mc<=dc-Sc;mc++)
		{
			ArrayList<String> c=getpthswthjmp(sr,Sc+mc,dr,dc);
			for(String path:c )
				ret.add("h"+mc+path);
			
		}
		for(int mc=1;mc<=dr-sr;mc++)
		{
			ArrayList<String> r=getpthswthjmp(sr+mc,Sc,dr,dc);
			for(String path:r )
				ret.add("v"+mc+path);
			
		}
		for(int mc=1;mc<=dr-sr && mc<=dc-Sc;mc++)
		{
			ArrayList<String> d=getpthswthjmp(sr+mc,Sc+mc,dr,dc);
			for(String path:d )
				ret.add("d"+mc+path);
			
		}
		
		
		return ret;
	}

}
