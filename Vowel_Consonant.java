import java.util.*;
class Vowel_Consonant 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char c=sc.next().charAt(0);

		/*if(c=='a' | c=='e' | c=='i' | c=='o' | c=='u'){
			System.out.println(c+" is vawel");
		}else{
			System.out.println(c+" is consonant");
		} */
		//System.out.println("Hello World!");

		switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println("c+" is consonant");
			break;
		default :
			System.out.println("c+" is consonant");
		}
	}
}
