package first;

import java.util.ArrayList;
import java.util.Scanner;

public class MazeWithStart {

	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter source coordinate row col");
    int sr=sc.nextInt();
    int Sc=sc.nextInt();
    System.out.println("enter destination coordinate row col");
    int dr=sc.nextInt();
    int dc=sc.nextInt();
    sc.close();
	ArrayList<String> paths=getpaths(sr,Sc,dr,dc);
	System.out.println(paths);
	System.out.println(paths.size());
	}
	public static ArrayList<String>getpaths(int sr,int sc,int dr,int dc)
	{
		if(sr==dr && sc==dc)
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add("");
			return temp;
		}
		ArrayList<String> h=new ArrayList<String> ();
		ArrayList<String> v=new ArrayList<String> ();
		ArrayList<String> ret=new ArrayList<String> ();
		if(sr<dr)
			v=getpaths(sr+1,sc,dr,dc);
		if(sc<dc)
			h=getpaths(sr,sc+1,dr,dc);
		for(String val:v)
		    ret.add("v"+val);
		for(String val:h)
			ret.add("h"+val);
		
		return ret;
	}

}
