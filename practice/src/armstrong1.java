
public class armstrong1 {
	public static void main(String[] args) {
		int num=371;
		int count=0;
		int sum=0;
		int temp=num;
		int temp1=num;
		
		while(num>0	) {
			num=num/10;
			count++;
			
		}
		while(temp>0) {
			int rem=temp%10;
			int prod=1;
			int i=1;
			while(i<=count) {
				prod=prod*rem;
				i++;
			}
			sum=sum+prod;
			temp=temp/10;
		
			
		}
		if(sum==temp1) 
			System.out.println(sum+"The given number is Arm Strong number");
			else
				System.out.println(sum+"The give number is not Arm Strong number");
		
	}

}
