import java.util.*;
class ASCIIValue
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any key to see the ascii value");
		 char ch=sc.next().charAt(0);
		//char ch=sc.nextLine(0);
		int res=ch;
		//char ch='a';
		//int res=ch;
		//int res=(int)ch;
		System.out.println("The Ascii value of "+ch+" is "+res);
	}
}
