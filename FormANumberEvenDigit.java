package Number_Program;

public class FormANumberEvenDigit {

	public static void main(String[] args) {
		int num=123456789;
		int res=0;
		while (num!=0) {
			int digit=num%10;
			if (digit%2==0) {
				res=res*10+digit;
			}
			num/=10;
		}
		System.out.println(res);
	}

}
