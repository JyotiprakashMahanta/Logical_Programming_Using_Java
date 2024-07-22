/*
1. it is used to store multiple values 
2. it is homogenious in nature - (elements of same type)
3. size of the array is fixed in length 
4. array is the fastest datastructure for inserting data 
   and accessing data using index. 
    inserting an element = O(1) 
    accessing element = O(1)
--------------------------------------------------------------------------------------------------------------------------------------
 *  To create an Array 
 * 
 *  case 1: create array using declare & initialization stmt
 *  case 2: create an array using new without initialization
 *  case 3: create an array using new & initialization 

 */
class Array0_0
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6};
		System.out.println(a);

		for (int index=0;index<a.length ;index++ )
		{
			System.out.print(a[index]+",");
		}
	}
}
