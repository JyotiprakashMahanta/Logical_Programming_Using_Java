class MaxMinFindInArray 
{
	public static void main(String[] args) 
	{
		int q[]={12,9,644,34,91};

		int max=q[0];

		for(int i=1;i<q.length;i++)
		{
			if(q[i]>max)
			{
				max=q[i];
			}
		}
		System.out.println("Max no. in the array: "+max);

		int min=q[0];

		for (int o=1;o<q.length ;o++ )
		{
			if (q[o]<min)
			{
				min=q[o];
			}
		}
		System.out.println("Min No. in the array: "+min);

	}
}
