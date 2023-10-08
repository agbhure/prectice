
public class perfect {
	public static void main(String[] args) {
		int num=6;
		int i=1;
		int sum=0;
		while(i<=num/2) {
			if(num%i==0) {
				sum=sum+i;
			}
			i++;
			
			
		}
		if(sum==num) 
			System.out.println(sum+"The given number is perfect");
			else
				System.out.println(sum+"The give number is not perfect number");
			
		}
	
}
