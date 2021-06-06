package first;

import java.util.Scanner;

public class PrintStarePaths {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
		printStarepaths(pos,"");
		
	}
	public static void printStarepaths(int input,String Output)
	{
		if(input<=0)
		{
			if(input==0)
				System.out.print(Output+" , ");
			return;
		}
		
		printStarepaths(input-1,Output+"1");
		printStarepaths(input-2,Output+"2");
		printStarepaths(input-3,Output+"3");
	}

}
