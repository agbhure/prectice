
public class Strong {
	public static void main(String[] args) {
		int n=146
				;
		int sum=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			while(rem>0) {
				fact=fact*rem--;
				
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp) 
			System.out.println(temp+"The given number is Strong number");
			else
				System.out.println(temp+"The given number is not Strong number");
		}
	}


