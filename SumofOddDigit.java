package Number_Program;

public class SumofOddDigit {
	public static void main(String[] args) {
		int num=888831;
		int sum=0;
		while (num!=0) {
			int digit=num%10;
			if (digit%2==1) {
				sum+=digit;
			}
			num/=10;
		}
		System.out.println(sum);
	}

}
