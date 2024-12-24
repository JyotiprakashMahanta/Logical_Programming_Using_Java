package Number_Program;

public class Reverse_Number {
	public static void main(String[] args) {
		int num=98782;
		while (num!=0) {
			System.out.print(num%10);
			num/=10;
		}
	}
}
