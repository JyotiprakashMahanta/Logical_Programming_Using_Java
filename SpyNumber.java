package Number_Program;

public class SpyNumber {

	public static void main(String[] args) {
		int num=123;
		int product=1;
		int sum=0;
		while (num!=0) {
			int digit=num%10;
			sum+=digit;
			product*=digit;
			num/=10;
		}
		if (product==sum) {
			System.out.println("It is a spy number...");
		}else {
			System.out.println("It is not a spy number...");
		}
	}

}
