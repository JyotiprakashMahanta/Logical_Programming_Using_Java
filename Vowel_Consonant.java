import java.util.Scanner;
class Vowel_Consonant 
{
	public static void main(String[] args) 
	{
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter a chracter: ");
		char c=cs.next().charAt(0);
		char ch=Character.toLowerCase(c);
		if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}else{
			System.out.println(ch+" is a consonat");
		}
	}
}
