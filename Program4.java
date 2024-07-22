import java.util.Scanner;
class Program4 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int evennum=0;
		if (num1%2==0)
		{
			evennum++;
		}
		if (num2%2==0)
		{
			evennum++;
		}
		if (num3%2==0)
		{
			evennum++;
		}
		switch(evennum)
		{
			case 1:
			{
				if (num1%2==0)
				{
					System.out.println(num1);
				}
				if (num2%2==0)
				{
					System.out.println(num2);
				}
				if (num3%2==0)
				{
					System.out.println(num3);
				}
			} break;
			case 2:
			{
				if (num1%2==0 && num2%2==0)
				{
					System.out.println(num1+num2);
				}
				if (num1%2==0 && num3%2==0)
				{
					System.out.println(num1+num3);
				}
				if (num2%2==0 && num3%2==0)
				{
					System.out.println(num2+num3);
				}
			} break;
			case 3:
			{
				System.out.println(num1*num2*num3);
			}
			default:
			{
				System.out.println(0);
			}
		}
	}
}
