package org.yojitha.newyeargift.newyeargift;
import java.util.*;

public class sweets
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
 {
		 sweets obj1=new sweets();
	     sweets obj2=new sweets();
	     sweets obj3=new sweets();
    
    System.out.println("enter the number of sweets");
 	int n = sc.nextInt();
    String[] s=new String[n];
    int[] a=new int[n];
 	for (int i=1;i<=n;i++)
	{ 
		System.out.println("enter the sweet name" );
		String st=sc.next();
	    s[i]=st;
	    System.out.println("enter the weight of the sweet");
		int k=sc.nextInt();
		a[i]=k;
  
   }
 	
 		int  sum=0;
 		for(int j=1;j<=n;j++)
 		{
 			sum+=a[j];
 		}
 		System.out.println(sum);
 	}

}

class choc1 extends sweets
{
	choc1 c1=new choc1();
}
class choc2 extends sweets
{
	choc2 c2=new choc2();
}
