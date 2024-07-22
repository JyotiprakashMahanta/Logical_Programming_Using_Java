class ArrayP3 
{
	//create a method which can accept size and return
	// a new int[]
	//modifires returns_type methodName(arguments .  . .)
	public static int[] genIntArray(int size) 
	{
		//create an array
		//int[] array = new int[size];

		return new int[size];
	}
	/* 
	
	design a method which returns even numbers between 
	m & n
	*/
	public static void main(String[] args)
	{
		int[] v1=genIntArray(5);
		System.out.println(v1);
		System.out.println(v1.length);
	}
}
