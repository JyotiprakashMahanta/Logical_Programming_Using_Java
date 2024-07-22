import java.util.*;
class MissingNumberofArray 
{
	public static void main(String[] args) 
	{
		int num[]={1,2,3,4,5,6,7,9};
		int sum1=0;
		for (int i=0;i<num.length ;i++ )
		{
			sum1=sum1+num[i];
		}
		System.out.println("Sum of the number of the array "+sum1);
		int sum2=0;
		for (int i=0;i<=9 ;i++ )
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range number of the array "+sum2);
		System.out.println("missing "+(sum2-sum1));
	}
}
