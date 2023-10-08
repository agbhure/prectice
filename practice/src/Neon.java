
public class Neon {
	public static void main(String[] args) {
		int num=10;
		int sq=num*num;
		int sum=0;
		while(sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		
		}
		if(sum==num)
			System.out.println(num+"The given number is spay number");
		else
			System.out.println(num+"The given number is not spay number");
		
	}

}
