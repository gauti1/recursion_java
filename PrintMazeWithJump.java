package first;

import java.util.Scanner;

public class PrintMazeWithJump {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    System.out.println("enter source coordinate row col");
	    int sr=sc.nextInt();
	    int Sc=sc.nextInt();
	    System.out.println("enter destination coordinate row col");
	    int dr=sc.nextInt();
	    int dc=sc.nextInt();
	    sc.close();
	    MazeWithJump(sr,Sc,dr,dc,"");

	}
	public static void MazeWithJump(int sr,int sc,int dr,int dc,String output)
	{
		if(sr==dr && sc==dc)
		{
			System.out.print(output+" , ");
			return;
		}
		
		for(int jc=1;jc<=dr-sr;jc++)
			MazeWithJump(sr+jc,sc,dr,dc,"v"+jc+output);
		for(int jc=1;jc<=dc-sc;jc++)
			MazeWithJump(sr,sc+jc,dr,dc,"h"+jc+output);
		for(int jc=1;jc<=dr-sr && jc<=dc-sc;jc++)
			MazeWithJump(sr+jc,sc+jc,dr,dc,"d"+jc+output);
		
	}
	

}
