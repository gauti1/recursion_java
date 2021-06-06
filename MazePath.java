package first;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of maze");
		int row =sc.nextInt();
		int col=sc.nextInt();
		ArrayList<String>Maze =mazepath(row,col);
		System.out.println(Maze);
		System.out.println(Maze.size());
		

	}
	public static ArrayList<String>mazepath(int R,int C)
	{
		
		if(R==1)
		{ArrayList<String> tempret=new ArrayList<String>();
		String s="";
		for(int i=1;i<C;i++)
			s=s+"h";
		tempret.add(s);
		return tempret;
		}
		else if(C==1)
		{ArrayList<String> tempret=new ArrayList<String>();
		String s="";
		for(int i=1;i<R;i++)
			s=s+"v";
		tempret.add(s);
		return tempret;
		}
		ArrayList<String> ret=new ArrayList<String>();
		ArrayList<String>paths1=mazepath(R-1,C);
		ArrayList<String>paths2=mazepath(R,C-1);
		for(String path:paths1)
			ret.add(path+"v");
		for(String path:paths2)
			ret.add(path+"h");
		
		return ret;
	}

}
