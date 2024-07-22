class MergeArray 
{
	public static int[] mergeArray(int[] a1,int[] a2){
		int[] a=new int[a1.length+a2.length];
		int i=0,j=0,k=0;
		while (i<a1.length && j<a2.length)
		{
			if (a1[i]<a2[j])
			{
				a[k++]=a1[i++];
			}
			else{
				a[k++]=a2[j++];
			}
		}
		while(i<a1.length){
			a[k++]=a1[i++];
		}
		while(j<a2.length){
			a[k++]=a2[j++];
		}
		return a;
	}
	
	public static void printArray(int[] a){
		for (int i=00;i<a.length ;i++ )
		{
			System.out.print(a[i]+",");
		}
	}
	public static void main(String[] args) 
	{
		int[] a1={2,3,1};
		int[] a2={5,4,9};
		int[] a=mergeArray(a1,a2);
		printArray(a);
	}
}
