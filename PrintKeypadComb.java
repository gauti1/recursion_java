package first;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintKeypadComb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
	    String a=sc.nextLine();
		
		Printkeypad(a,"");
		

		}
		static String []alp= {" ","abc","def","ghij","klm","nopq","rst","uvw","xyz","?!@#"};

	
   public static void Printkeypad(String Input,String Output)
  {
	   if(Input.isEmpty())
	   {
		   System.out.print(Output+" , ");
		   return;
	   }
	   
	char ch=Input.charAt(0);
	String s=alp[ch-'0'];
	for(int i=0;i<s.length();i++)
	{
		Printkeypad(Input.substring(1),s.charAt(i)+Output);
	}


  }

}
