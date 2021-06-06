package first;

public class TOH {

	public static void main(String[] args) {
		toh('A','B' ,'C',2);

	}
	public static void toh(char s ,char m,char d,int n)
	{if(n==0)
		return;
	
		toh(s,d,m,n-1);
		System.out.println(n +"th from "+s +" to "+d);
		toh(m,s,d,n-1);
		
	}
	

}
