package first;

import java.util.Scanner;

public class QueenSafeposition{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of chess board");
		int n=sc.nextInt();
		sc.close();
		int [][] chess=new int[n][n];
		printsafeposition(chess,0,"");
	}
public static void printsafeposition(int [][]chess,int row,String ans)
{
if(row==chess.length)
{System.out.println(ans);
return;
}
for(int col=0;col<chess.length;col++)
{if(isSafe(chess,row,col))
{
chess[row][col]=1;
printsafeposition(chess,row+1,ans+row+"-"+col+" , ");
chess[row][col]=0;
}
}


}
public static boolean isSafe(int[][]chess,int row,int col)
{
for(int i=row,j=col;i>=0;i--)
{if(chess[i][j]==1)
	return false;
}
for(int i=row,j=col;i>=0 && j>=0;i--,j--)
{if(chess[i][j]==1)
	return false;
}
for(int i=row,j=col;i>=0 && j<chess.length;i--,j++)
{if(chess[i][j]==1)
	return false;
}

return true;
}
}
