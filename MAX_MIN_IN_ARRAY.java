class MAX_MIN_IN_ARRAY 
{
	public static void main(String[] args) 
	{
		int num[] = {92,19,39,04,20,449};
		int max=num[0];
		for (int i=0;i<num.length ;i++)
		{
			if (max<num[i])
			{
				max=num[i];
			}
		}
		System.out.println("MAX is "+max);

		int min=num[0];
		for ( int i=0;i<num.length ;i++ )
		{
			while (min>num[i])
			{
				min=num[i];
			}
		}
		System.out.println(min);
	}
}
