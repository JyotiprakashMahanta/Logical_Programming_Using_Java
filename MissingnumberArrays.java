class MissingnumberArrays 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,5,6};
		int sum=0;
		for(int i=0;i<a.length ;i++ )
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		int sum2=0;
		for (int i=0;i<=6 ;i++ )
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		System.out.println("is missing"+(sum2-sum));
		/*if (sum==sum2)
		{
			System.out.println("nothing is missing");
		}else{
			//System.out.println((sum-sum2)+"is missing");
		}*/
	}
}
