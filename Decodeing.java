package first;

import java.util.Scanner;

public class Decodeing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of any digit");
		String ip=sc.next();
		sc.close();
		Decode(ip,"");
		

	}
	static char alp[]= {'_','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

public static void Decode(String ip,String op)
{
	if(ip.isEmpty())
	{
		System.out.print(op+" , ");
		return;
	}
//		
//	Decode(ip.substring(1),ip.charAt(0)-'0'==0?op:op+alp[ip.charAt(0)-'0']);
//	if(ip.length()>1)
//		Decode(ip.substring(2),(ip.charAt(0)-'0')*10+ip.charAt(1)-'0'>27?op:op+alp[(ip.charAt(0)-'0')*10+ip.charAt(1)-'0']);

int i=0,j=0;
String res1="";
String res2="";
if(ip.length()>=2)
{i=Integer.parseInt(ip.substring(0,2));
res2=ip.substring(2);
}
j=Integer.parseInt(ip.substring(0,1));
res1=ip.substring(1);
if(j>0)
	Decode(res1,op+alp[j]);
else return;
if(i>0 && i<27)
	Decode(res2,op+alp[i]);
else return;


}

}
