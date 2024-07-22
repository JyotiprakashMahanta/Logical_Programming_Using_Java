/*
 design a method which can accept an int and 
 return true if the int is prime, 
 false if int is not a prime
*/
import java.util.Scanner;

class PrimeNumber_ 
{
	public static boolean isPrime(int num)
	{
		int count=2;
		for (int i=2;i<=num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if (isPrime(num))
		{
			System.out.println("It is a Prime Number..");
		}
		else
		{
			System.out.println("It is a Not Prime Number..");
		}
	}
}
