class Duplicate_Element_Array  
{
	public static void main(String[] args) 
	{
		boolean flag=false;

		/*int num[]={1,2,3,4,5,6,7};
		for (int i=0;i<num.length ;i++ )
		{
			for (int j=i+1;j<num.length ;j++ )
			{
				if (num[i]==num[j])
				{
					System.out.println("Duplicate: "+num[i]);
					flag=true;
				}
			}
		}*/

		String str[]={"Dipu","Papu","Rudra","Dana"};
		for (int i=0;i<str.length ;i++ )
		{
			for (int j=i+1;j<str.length ;j++ )
			{
				if (str[i]==str[j])
				{
					System.out.println("Duplicate: "+str[i]);
					flag=true;
				}
			}
		}
		if (flag==false)
		{
			System.out.println("Not found");
		}
	}
}
