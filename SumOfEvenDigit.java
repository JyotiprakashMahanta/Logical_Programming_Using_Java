package Number_Program;

public class SumOfEvenDigit {

	public static void main(String[] args) {
		int num=2133;
		int sum=0;
		int position=0;
		while (num!=0) {
			int digit=num%10;
			if (position%2==0) {
				sum+=digit;
			}
			num/=10;
			position++;
		}
		System.out.println(sum);
	}

}
