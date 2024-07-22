class ArrayP4 
{
	/* 
	design a method which returns even numbers between 
	m & n include m and n
	*/

	public static int evenCount(int m,int n)
	{
		int count = 0;
		//count even number between m and n
		for (int i=m;i<=n ;i++ )
		{
			if (i % 2==0)
			{
				count++;
			}
			return count;
		}
	}

	public static int[] genEven(int m,int n){
		//step 1 : create an array to store even nos.
		
		int[] even_nos = new int[evenCount(m,n)]; 

		//step 2: gen even data store into the array
		for (int i=m;i<=n ;i++)
		{
			if (i%2==0)
			{
				//store i into the array
				even_nos[index++] = i;
			}//end of if
		}//end of for

		//step 3: return array reference

		return even_nos ;
	}
/*	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}*/
}
