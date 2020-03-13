import java.util.*;


public class Main
{

	public static void main(String[] args) {

	    Scanner in = new Scanner (System.in);
			    int n = in.nextInt();

                     int a[]=new int[n];

                     int freq[]=new int[1000];
             
        for(int i=0;i<n;i++)
       
	 {
            
                   a[i]=in.nextInt();

                   freq[a[i]]++;

                  }
       
	 for(int i=0;i<n;i++)
        {

	            if(freq[a[i]]>1)
            {
                		System.out.print(a[i]+" ");
               
		 freq[a[i]]=0;
    
        }
       
 }
        
	
}
}