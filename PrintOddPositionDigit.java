package Number_Program;

public class PrintOddPositionDigit {

	public static void main(String[] args) {
		int num=8921,temp=num;
		int count=0;
		while (num!=0) {
			count++;
			num/=10;
		}
		while (temp!=0) {
			if (count%2==1) {
				System.out.println(temp%10);
			}
			temp/=10;
			count--;
		}
	}

}
