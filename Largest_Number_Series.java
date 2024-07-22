import java.util.Scanner;
class  Largest_Number_Series
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int largest_num=num%10;
		num/=10;
		while (num!=0)
		{
			int digit=num%10;
			if (digit>largest_num)
			{
				largest_num=digit;
			}
			num/=10;
		}
		System.out.println(largest_num);
	}
}
