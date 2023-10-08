package Practice;

public class ArmStrong {
	public static void main(String[] args) {
		int num=371;
		int sum=0;
		int temp=num;
		int temp1=num;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
			
		}
		while(temp>0) {
			int rem=num%10;
			int prod=1;
			int i=1;
			while(i<count) {
				
					prod=prod*rem;
				i++;
				}
				sum=sum+prod;
			temp=temp/10;
			}
			if(sum==temp1) 
				System.out.println("The Given number is ArmStrong number "+temp1);
			else
				System.out.println("The Given number is not ArmStrong number :"+temp1);
				
				
			
			
		}
			
	}


