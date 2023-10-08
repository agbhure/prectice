
public class prime {
	public static void main(String[] args) {
		
            int n=19;
            int count=0;
            int i=2;
            
            
            while(i<n/2)
            {
           	 if(n%i==0)
           	 {
           		 count++;
           		 break;
           	 }
           	 i++;
            }
            if(count==0)
            {
           	 System.out.println(n+" is a prime number");
           	 
            }
            else
            {
           	 System.out.println(n+" is not a prime number");
            }
	}


}
