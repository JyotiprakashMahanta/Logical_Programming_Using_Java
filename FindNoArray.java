import java.util.Scanner;
class  FindNoArray
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5,6,7,8,9};
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		for (int i=0;i<a.length ;i++ )
		{
			if (num==a[i])
			{
				System.out.println("Element Found "+i+"th index Position");
				flag=true;
				break;
			}
		}
		if (flag==false)
		{
			System.out.println("Element not found...");
		}
	}
}
