import java.util.Arrays;
class ArraysEqity
{
	public static void main(String[] args){
		String s1[]={"Good","Better","Best","Awome"};
		String s2[]={"Good","Better","Best","Awome"};
	/*	boolean status=Arrays.equals(s1,s2);
		if (status==true)
		{
			System.out.println("=");
		}else{
			System.out.println("!=");
		} */

		boolean status=true;
		if (s1.length==s2.length)
		{
			for(int i=0;i<s1.length;i++)
			{
				if (s1[i]!=s2[i])
				{
					status=false;
				}
			}
		}else{status=false;}
		if (status==true)
		{
			System.out.println("Equals");
		}
		else{
			System.out.println("Not Equals");
		}
	}
}