import java.util.Scanner;
class  GCD
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int largest=num1>num2?num1:num2;
		for (int i=2;i<=largest/2 ;i++ )
		{
			if (num1%i==0 && num2%i==0)
			{
				largest=i;
				break;
			}
		}
		System.out.println(largest);
	}
}
