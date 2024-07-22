import java.util.Scanner;
class  PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int count=2;
		if (num1>0)
		{
			
				for (int i=2;i<=num1/2 ;i++ )
		{
			if (num1%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("It is a Prime Number...");
		}
		else{
			System.out.println("It is not a prime number...");	
		}
			
		}else
			{
			System.out.println("Invaild Number...");
			}
		/*else if (num1<=0)
		{
			System.out.println("Invaild Number...");
		}*/
	}
}
