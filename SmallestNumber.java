class SmallestNumber 
{
	public static void main(String[] args) 
	{
		int num1=16;
		int num2=1;
		int num3=-66;
		int num4=222;
		if (num4>num1)
		{
			if (num3>num1)
			{
				if (num2>num1)
				{
					System.out.println(num1);
				}else{
					System.out.println(num2);
				}
			}else{
				System.out.println(num3);
			}
		}else{
			System.out.println(num4);
		}
	}
}
