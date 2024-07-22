class RemoveDuplicate 
{
	public static int removesDuplicate(int[] nums,int val)
	{
		int j=0;
		for (int i=0;i<nums.length ;i++ )
		{
			if (nums[i]!=val)
			{
				nums[j]=nums[i];
				j++;
			}
		}
		return j;
	}
	public static void main(String[] args) 
	{
		int nums[]={4,4,4,4,5,6,8};
		int val=4;
		int k=removesDuplicate(nums,val);
		System.out.println("count: "+k);
		for (int i=0;i<nums.length ;i++ )
		{
			System.out.print(nums[i]+",");
		}
	}
}
