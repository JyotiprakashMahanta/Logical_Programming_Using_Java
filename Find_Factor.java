/*3.Write a java program to count the number of factors of a given integer number.*/

import java.util.Scanner;
class Find_Factor 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.print(1+",");
		for (int i=2;i<=num/2 ;i++ )
		{
			if (num%i==0)
			{
				System.out.print(i+",");
			}
		}
		System.out.println(num);
	}
}
