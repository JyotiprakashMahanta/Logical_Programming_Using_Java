import java.util.*;
class  SwapNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number\ni= ");
		int i=sc.nextInt();
		System.out.print("j= ");
		int j=sc.nextInt();
		/*int k=j;
		 j=i;i=k;k=j;
		System.out.println("After swap i="+i+" j= "+j);*/

		/*int k=i+j;
		j=k-j;
		i=k-i;*/

		/*i=i-j;
		j=i+j;
		i=j-i;*/

		i=i/j;
		j=i*j;
		i=j/i;
		System.out.println("i: "+i+" j: "+j);
	}
}
