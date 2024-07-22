/*
 * Write a method to find the frequency of each element in 
 * the given integer array.
    Test Case 1: 

	Input :  [1, 8, 6 , 1 , 0 , 8]
	Output :    1 : 2 
                8 : 2 
                6 : 1 
                0 : 1 ?


Test Case 2: 

	Input :   [ 2, 2 , 3 , 3 , 2]
	Output :    2 : 3 
                3 : 2 

 */
 class ProgramArray3
 {
	 public static void freqencyCount(int[] array)
	 {
		int visited=Integer.MIN_VALUE;
		for (int i=0;i<array.length ;i++)
		{
			int count=1;
			if (array[i]!=visited)
			{
				for (int j=i+1;j<array.length ;j++ )
				{
					if (array[i]==array[j])
					{
						count++;
						array[j]=visited;
					}
				}
				System.out.println(array[i]+":"+count);
			}
		}
	 }
	public static void main(String[] args)
	 {
		int[] a={10,20,30,40,40,60,10};
		freqencyCount(a);
	 }
 }