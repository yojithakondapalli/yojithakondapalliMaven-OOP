package org.yojitha.newyeargift.newyeargift;
import java.util.*;
public class Gift
{
	static Scanner gi = new Scanner(System.in);
    public static void main( String[] args )
    {
    	
    	System.out.println("enter the number of choclates");
    	int n = gi.nextInt();
    	int p;
    	int a[]=new int[n];
    	int b[]=new int[n];
    	int r[]=new int[n];
    	String[] choc =new String[n];
    	for (int i=1;i<=n;i++)
    	{ 
    		System.out.println("enter the choclate name" );
    		String s=gi.next();
    		choc[i]=s;
    		System.out.println("enter the choclate type 1.candy 2.cream");
    		int z=gi.nextInt();
    		r[i]=z;
    		System.out.println("enter the weight of the choclate");
    		int k=gi.nextInt();
    		a[i]=k;
      		System.out.println("enter the price of the choclate");
    		p = gi.nextInt();
    		b[i]=p;
    	}	
    	System.out.println("To find candies by 1.weight 2.price");
    	int e=gi.nextInt();
    	if(e==1)
    	{
    	System.out.println("enter the lowest weight");
    	int low=gi.nextInt();
    	System.out.println("enter the highest weight");
    	int high=gi.nextInt();
    	for(int i=1;i<=n;i++)
    	{
    		if(r[i]==1)
    		{
    			if(a[i]>low&&a[i]<high)
                 {
                	 System.out.println(choc[i]+" "+a[i]);
	
                    }

    		}
    	}
    	}
    	else
    	{
        System.out.println("enter the lowest price");
    	int low=gi.nextInt();
    	System.out.println("enter the highest price");
    	int high=gi.nextInt();
    	for(int i=1;i<=n;i++)
    	{
    		if(r[i]==1)
    		{
    			if(a[i]>low&&a[i]<high)
                 {
                	 System.out.println(choc[i]+" "+a[i]);
	
                    }

    		}
    	 }
    	}
        System.out.println(" Total weight of the gift" );
        totalweight(a,n);
        System.out.println("Sort the choclates by 1.price 2.weight");
        int choice =gi.nextInt();
        if (choice==1)
        {
        	sortchoclatesbyprice(choc,b,n);
        }
        else
        {
        	sortchoclatesbyweight(choc,a,n);
        }
             
             
    }
    public static void sortchoclatesbyprice(String [] choc,int[] b,int n)
    { 
    	Map<String, Integer>hm= new HashMap<String,Integer>(); 
    	for(int i=0;i<n;i++)	
    	{
    		hm.put(choc[i],b[i]);
    	}  
	}
	public static void sortchoclatesbyweight(String [] choc,int[] a,int n)
    {
    	HashMap<String, Integer>chocweight= new HashMap<String,Integer>(); 
    	for(int i=0;i<n;i++)
    		
    	{
    		chocweight.put(choc[i],a[i]);
    	}
    	
    }
    
    public static void totalweight(int [] a,int n)
    {
    	 int  sum=0;
    	for(int j=1;j<=n;j++)
    	{
    		sum+=a[j];
    	}
    	System.out.println(sum);
    }
}
