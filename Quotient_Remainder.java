import java.util.*;
class  Quotient_Remainder
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number to show Quotient And Reminder");
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println("Quotient of "+first+" and "+second+"is: "+first/second);
		System.out.println("Reminder of "+first+" and "+second+"is: "+first%second);
	}
}
