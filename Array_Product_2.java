/*
 * Given an array nums of n integers where n > 1, 
 * return an array output such that output[i] is equal to 
 * the product of all the elements of nums except nums[i].

    Test Case 1: 

	Input: [1, 2, 3, 4] 
Output: [24, 12, 8, 6]


Test Case 2: 

	Input: [2, 3, 4, 5]
Output: [60, 40, 30, 24]


 */
class  Array_Product_2
{
	public static int[] genArray(int[] array){
		int[] newArray = new int[array.length];
		boolean zeroFlag = false;
		int product =1;
		for (int i=0;i<array.length ;i++ )
		{
			if (array[i] != 0)
			{
				product *= array[i];
			}
			else{
				zeroFlag = true;
			}
		}
		if (zeroFlag == false)
		{
			for (int i=0;i<array.length ;i++ )
			{
				newArray[i]=product/array[i];
			}
		}
		else{
			for (int i=0;i<array.length ;i++ )
			{
				if (array[i] ==0)
				{
					newArray[i] = product;
				}
			}
		}

		return newArray;
	}
	public static void main(String[] args) 
	{
		int[] a={1,1,1,0,1};
		int[] res=genArray(a);
		for (int i=0;i<res.length ;i++ )
		{
			System.out.print(res[i]+",");
		}
	}
}
