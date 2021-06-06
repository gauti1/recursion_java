package first;

public class Arrray {
	public static void main(String[] args) {
		int []a= {2,5,3,3,8,7,17,2,3};
		arrpt(a,8);
		System.out.println();
		arrpt1(a,0);
		System.out.println();
		arrpt2(a,0);
		System.out.println();
		System.out.println(maxarr(a,0));
		System.out.println();
		System.out.println(firstidx(a,0,3));
		System.out.println();
		System.out.println(lastidx(a,0,3));
        System.out.println();
        int []b=allindices(a,3,0,0);
        arrpt(b,b.length-1);




	}
	public static void arrpt(int []a,int n)
	{
		if(n<0)
			return;
		arrpt(a,n-1);
		System.out.print(a[n]+" ");
	}
	
	public static void arrpt1(int []a,int n)
	{
		if(n>=a.length)
			return;
		System.out.print(a[n]+" ");
		arrpt1(a,n+1);
		
	}
	public static void arrpt2(int []a,int n)
	{
		if(n>=a.length)
			return;
		
		arrpt2(a,n+1);
		System.out.print(a[n]+" ");
		
	}
	public static int maxarr(int []a,int n)
	{
		if(n>=a.length)
			return -1;
		
		return Math.max(a[n],maxarr(a,n+1));
		
	}
	public static int firstidx(int []a,int n,int N)
	{
		if(a[n]==N)
			return n;
		return firstidx(a,n+1,N);
		
		
	}
	public static int lastidx(int []a,int n,int N)
	{
		if(n==a.length)
			return -1;
		
		if(lastidx(a,n+1,N)==-1)
		{
			return a[n]==N?n:-1;
			
		}
		else return lastidx(a,n+1,N);
		
		
	}
	public static int[] allindices(int []a,int x,int indx,int fsf)
	{
		if(indx==a.length)
			return new int[fsf];
		if(a[indx]==x)
		 {
			int []b=allindices(a,x,indx+1,fsf+1);
		    b[fsf]=indx;
		    return b;
		}
		
		else
		{
			int []b=allindices(a,x,indx+1,fsf);
		     return b;
		}
		
    } 

}
