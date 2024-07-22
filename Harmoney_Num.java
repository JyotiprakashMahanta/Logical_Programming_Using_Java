import java.util.Scanner;
class Harmoney_Num 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int org_num=num;
		int last_dight=num%10;
		num=org_num;
		System.out.println(last_dight);
	}
}
