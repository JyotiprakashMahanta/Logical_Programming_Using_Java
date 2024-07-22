class Array1 
{
	public static int evenCount(int[] array)
	{
		int count=0;
		for (int i=0;i<array.length ;i++ )
		{
			if (array[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		int[] a={10,20,30,40,44,55,66,77};
		System.out.println(evenCount(a));
	}
}
