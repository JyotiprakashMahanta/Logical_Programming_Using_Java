package Number_Program;

public class FindEvenNumber {

	public static void main(String[] args) {
		int num=8782;
		while (num!=0) {
			int digit=num%10;
			if (digit%2==0) {
				System.out.println(digit);
			}
			num/=10;
		}
	}

}
