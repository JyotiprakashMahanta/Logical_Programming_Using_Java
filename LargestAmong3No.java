class LargestAmong3No 
{
	public static void main(String[] args) 
	{
		int a=-10;
		int b=920;
		int c=-30;
		int d=12;
		System.out.println(a>b?(a>c?(a>d?a:(d>a?(d>b?(d>c?d:c):b):a)):c>a?(c<b?(c>d):b):a):b>a?(b>c?(b>d?b:d):c):a);
		//int mid=a>b?a:b;
		//int largest=mid>c?mid:c;
		//System.out.println(largest);
	}
}
