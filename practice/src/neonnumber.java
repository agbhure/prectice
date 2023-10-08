
public class neonnumber {
	public static void main(String[] args) {
		int num=25;
		int count=0;
		int i=1;
		while(i<=num) {
			if(num+1==i*i)
			{
				count++;
				break;
				
			}
			i++;
		}
		if(count==1)
			System.out.println(num+"The given number is neon ");
		else
			System.out.println(num+"The given number is not neon");
		
		
	}

}
