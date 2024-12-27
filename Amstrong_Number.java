package Number_Program_2;

public class Amstrong_Number {
	public static void main(String[] args) {
		int num=153;
		if (isArmstrong(num)) {
			System.out.println("It is a Armstrong Number");
		}else {
			System.out.println("It is not a Armstrong Number");
		}
		
	}

	private static boolean isArmstrong(int i) {
		int temp=i;
		int sum=0;
		int count=count(i);
		System.out.println(count);
		System.out.println(i);
		while(i!=0) {
			int digit=i%10;
			int tempsum=0;
			for (int j = 1; j >= count; j++) {
				tempsum+=count*digit;
			}
			sum+=tempsum;
		}
		return temp==sum;
	}

	private static int count(int i) {
		int count=0;
		while (i!=0) {
			count++;
			i/=10;
		}
		return count;
	}
}
