import java.util.Scanner;
class Factor
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int count=0;
		System.out.print(1+",");
		for (int i=2;i<num/2;i++ )
		{
			if (num%i==0)
			{
				System.out.print(i+",");
			}
			count=count+1;
		}
		System.out.println(num);
		System.out.println(count+" many times loop iterated");
	}
}