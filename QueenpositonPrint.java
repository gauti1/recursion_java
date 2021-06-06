package first;

import java.util.Scanner;

public class QueenpositonPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of chess board");
		int n=sc.nextInt();
		sc.close();
		int [][] chess=new int[n][n];
		printallposition(chess,0,"");
	}
public static void printallposition(int [][]chess,int row,String ans)
{
if(row==chess.length)
{System.out.println(ans);
return;
}
for(int col=0;col<chess.length;col++)
{
//chess[row][col]=1;
printallposition(chess,row+1,ans+row+"-"+col+" , ");
//chess[row][col]=0;

}


}
}
