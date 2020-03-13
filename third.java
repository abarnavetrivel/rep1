import java.util.*;


public class Main
{

		public static void main(String[] args) {
	    		
		Scanner in = new Scanner (System.in);

		String s1,s2;

		s1=in.next();

		s2=in.next();

		int c;

		char a1[]=s1.toCharArray();

		char a2[]=s2.toCharArray();

	                 if(s1.length()!=s2.length())
        {
            			System.out.println("Not an anagram");
        }
        		else
        {

		                 Arrays.sort(a1);
            
			Arrays.sort(a2);
	                	
            c=0;
           
			 for(int i=0;i<s1.length();i++)
            
			{
               
			 if(a1[i]!=a2[i])
               
			 {
                  
			  c++;
      
			          }
     
			       }
         
		   if(c==0)
            {
        
			        System.out.println("Anagram");
     
		       }
         
		   else{
        
		        System.out.println("Not an anagram");
      
      }
      	
  }
	
}
}
