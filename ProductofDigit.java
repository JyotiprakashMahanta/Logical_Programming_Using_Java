package Number_Program;

public class ProductofDigit {

	public static void main(String[] args) {
		int num=1110;
		int product=1;
		while (num!=0) {
			int digit=num%10;
			product*=digit;
			num/=10;
		}
		System.out.println(product);
	}

}
