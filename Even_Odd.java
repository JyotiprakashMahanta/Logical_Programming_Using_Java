import java.util.*;
class Even_Odd 
{
	public static void main(String[] args) 
	{
		//int a=103085;

		/* if(a%2==0){
			System.out.println(a+": is even number");
		}else{
			System.out.println(a+" :is odd number");	
		} */
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to show where it is odd or even: ");
		int num = sc.nextInt();
		String s=(num%2==0) ? "even" : "odd" ;
		System.out.println(num+" is "+s);
		
	}
}
