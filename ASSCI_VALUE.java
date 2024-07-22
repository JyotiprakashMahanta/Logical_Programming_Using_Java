import java.util.Scanner;
class ASSCI_VALUE 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if (ch>='A' && ch<='Z')
		{
			System.out.println(ch+" is UpperCase Latter");
		}
		else if(ch>='a' && ch<'z')
			{
			System.out.println(ch+" is LowerCase Latter");
		}else{
			System.out.println("It is not a alphabate");
		}
		
	}
}
