
public class spaynumber {
	public static void main(String[] args) {
		int num=123;
		int sum=0;
		int mul=1;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			
					num=num/10;
			
		}
		if(mul==sum) {
			System.out.println(sum+"The given number is Spay number");
		}
		else {
			System.out.println(mul+"The given number is not spay number ");
	}

}
}
