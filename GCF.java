import java.util.Scanner;
class  GCF
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		int largest=n1>n2?n1:n2;
		int hcf=1;
		for (int i=largest/2;i>=2 ;i-- )
		{
			if (n1%i==0 && n2%i==0)
			{
				hcf=i;
				break;
			}
		}
		System.out.println("HCF of "+n1+" & "+ n2+" is "+hcf);
	}
}
