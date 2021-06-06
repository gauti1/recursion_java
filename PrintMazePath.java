package first;

import java.util.Scanner;

public class PrintMazePath {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    System.out.println("enter source coordinate row col");
	    int sr=sc.nextInt();
	    int Sc=sc.nextInt();
	    System.out.println("enter destination coordinate row col");
	    int dr=sc.nextInt();
	    int dc=sc.nextInt();
	    sc.close();
		printmazepaths(sr,Sc,dr,dc,"");

	}
	public static void printmazepaths(int sr,int Sc,int dr,int dc,String output)
     {
		if(sr==dr && Sc==dc)
		{
			System.out.println(output+" , ");
          	return;	
		}
if(sr<dr)
	printmazepaths(sr+1,Sc,dr,dc,"v"+output);

if(Sc<dc)
	printmazepaths(sr,Sc+1,dr,dc,"h"+output);
     }
	
	

}
