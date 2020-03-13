import java.util.*;


public class Main

{
	
	public static void main(String[] args) 
	{
		
		int a[]=new int[100];
						Scanner in = new Scanner(System.in);
				int n=in.nextInt();

		for(int i=0;i<n;i++)

		{
		    
		a[i]=in.nextInt();

		}

		for(int i=0,j=n-1;j>i;i++,j--)

		{

		    int t=a[j];

		    a[j]=a[i];

		    a[i]=t;

		}
		
		for(int i=0;i<n;i++)

		{
		    
		System.out.println(a[i]);

		}
	
}
}