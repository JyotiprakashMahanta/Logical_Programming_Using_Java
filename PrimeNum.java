import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int count=2;
		for (int i=2;i<=num/2 ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("PRIME NUMBER");
		}else
		{
			System.out.println("NOT A PRIME NUMBER");
		}
	}
}
