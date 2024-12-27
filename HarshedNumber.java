package Number_Program_2;

public class HarshedNumber {
	public static void main(String[] args) {
		int num=24,temp=num,sum=0;
		while (num!=0) {
			int digit=num%10;
			sum+=digit;
			num/=10;
		}
		if (temp%sum==0) {
			System.out.println("It is harshed number..");
		}else {
			System.out.println("It is not harshed number..");
		}
	}
}
