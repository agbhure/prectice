
public class StrongNumber {
	public static void main(String[] args) {
		int num=145;
		int sum=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			int fact=1;
			while(rem>0) {
				fact=fact*rem--;
				
			}
			sum=sum+fact;
			num=num/10;
			
		}
		if(sum==temp) 
			System.out.println(num+"The given number is Strong number");
			else
				System.out.println(num+"the given number is not a strong number");
		}
	}


