import java.util.Scanner;
class  AddTwoNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int n1L=num1.lenght;
		int n2L=num2.length;
		if (n1L==n2L)
		{
			int left=num1%10;
			num1/=10;
		}
		else
		{
			System.out.println("Invalid Number...");
		}
		int left=num1%10;
		while (num1!=0)
		{
			while (num2!=0)
			{
				
			}
		}
	}
}
