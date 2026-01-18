package Basics;

public class LeapYear {
	public static void main(String[] args) {
		int year = 4000;
		boolean isLeap=(year%4==0&&year%100!=0)||(year%400==0);
		if (isLeap) {
			System.out.println("Yes");
		}else {
			System.out.println("NO");
		}
	}
}
