class SwapTwoNumber 
{
	public static void main(String[] args) 
	{
		int a=10,b=20;int c=0;
		System.out.println("before swap a="+a+" b="+b);

		/*a=a+b;
		b=a-b;
		a=a-b;*/

		/* c=b;
		b=a;
		a=c; */

	/*	a=a*b;
		b=a/b;
		a=a/b; */

	/*	a=a^b;
		b=a^b;
		a=a^b; */

		b=a+b-(a=b);
		
		System.out.println("after swap a="+a+" b="+b);
	}
}
