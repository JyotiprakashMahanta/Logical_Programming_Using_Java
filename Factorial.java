import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		int result=1;
		for (int i=1;i<=num ;i++ )
		{
			result *= i;
		}
		System.out.println(result);
	}
}
