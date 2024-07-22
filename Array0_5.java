import java.util.Scanner;
class Array0_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] nums=new int[size];
		for (int index=0;index<nums.length ;index++)
		{
			nums[index]=sc.nextInt();
		}
		for (int index=0;index<nums.length ;index++ )
		{
			System.out.print(nums[index]+",");
		}
	}
}