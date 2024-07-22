class DuplicateArrays 
{
	public static void main(String[] args) 
	{
		String str[]={"Jyoti","Biswa","Sudarsan","Danaradn","M","m"};
		boolean flag=false;
		//String str2="";
		for (int i=0;i<str.length ;i++ )
		{
			for (int j=i+1;j<str.length ;j++ )
			{
				if (str[i]==str[j])
				{
					System.out.println("Duplicate is: "+str[i]);
					flag=true;
				}
			}
		}
		if (flag==false)
		{
			System.out.println("Dulpicate not found");
		}
	}
}
