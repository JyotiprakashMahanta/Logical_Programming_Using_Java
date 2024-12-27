package Number_Program_2;

public class FindTheSumOfDigitUntilWeSingleDigit {
	public static void main(String[] args) {
		int num=902;
		while(num>=10) {
			int sum=0;
			while (num!=0) {
				int digit=num%10;
				sum+=digit;
				num/=10;
			}
			num=sum;
		}
		System.out.println(num);
	}
}
