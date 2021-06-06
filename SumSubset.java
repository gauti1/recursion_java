package first;

import java.util.Scanner;

public class SumSubset {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements of array");

		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter target number");
		int sum=sc.nextInt();
		sc.close();
		TargetSum(a,0,sum,"");
}
	
	public static void TargetSum(int []a,int index,int sum,String ans)
	{
		if(sum==0)
		{
			System.out.print(ans+" , ");
			return;
		}
		if(index==a.length)
			return;
		if(sum>=a[index])
		{
			TargetSum(a,index,sum-a[index],ans+a[index]);
			TargetSum(a,index+1,sum,ans);
		}
		else
		TargetSum(a,index+1,sum,ans);
	}

}
