package first;

import java.util.Scanner;

public class FludFill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array row*column");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]tab=new int[r][c]; 
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				tab[i][j]=sc.nextInt();
			}
		}
		sc.close();
		boolean [][]visit=new boolean[r][c];
		floodfill(tab,0,0,"",visit);

	}
	public static void floodfill(int [][]tab,int r,int c,String ans,boolean [][]visit)
	{
		
		if(r<0 || c<0 || r==tab.length || c==tab[0].length || tab[r][c]==1 || visit[r][c]==true)
			return;
		if(r==tab.length-1 && c==tab[0].length-1)
		{
			System.out.print(ans+" , ");
			return;
		}
		visit[r][c]=true;
		floodfill(tab,r-1,c,ans+"t",visit);
		floodfill(tab,r,c+1,ans+"r",visit);
		floodfill(tab,r+1,c,ans+"b",visit);
		floodfill(tab,r,c-1,ans+"l",visit);
		visit[r][c]=false;
	}
}
