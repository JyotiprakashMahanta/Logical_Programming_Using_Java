/*
 * Write a method to return the largest element in the given 
 * integer array
 * Test Case 1: 

	Input :[1,6,9,0,25,16]
	Output : 25

    Test Case 2: 

	Input : [ 4, 78, 98, 87, 120 ]
	Output : 120

    Test Case 3: 

	Input : [ 5, -24, 46,- 20 ,98]
	Output : 98

 */
class Array2 
{
	public static int largest(int[] array)
	{
		int largest=array[0];
		for (int i=0;i<array.length ;i++ )
		{
			if (array[i]>largest)
			{
				largest=array[i];
			}
		}
		return largest;
	}
	public static void main(String[] args)
	{
		int[] a={1,22,-3,4,5,7,5,2};
		System.out.println(largest(a));
	}
}
