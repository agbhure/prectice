package Practice;

public class ArmStrong1 {
public static void main(String[] args) {
		int num=371;
		int sum=0;
		int count=0;
		int temp=num;
		int temp1=num;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		while(temp>0) {
			int rem=temp%10;
			int i=1;
			int prod=1;
			while(i<count) {
				prod=prod*rem;
				i++;
			}
			sum=sum+prod;
			temp=temp+sum;
		}
if(sum==temp1)
	System.out.println("The given number is ArmStrong ");
else
	System.out.println("The Given number is not ArmStrong");

		}

}
