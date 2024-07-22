import java.util.Scanner;
class Switch 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		String day=s.next().toLowerCase();
		switch(day){
			case "monday":
			case "wednesday":
			{
				System.out.println("Basketball");	
			}break;
			case "tuesday":
			case "friday":
			{
				System.out.println("Tennis");
			} break;
			case "thursday":
			{
				System.out.println("Cricket");
			} break;
			case "saturday":
			{
				System.out.println("Exercise");
			} break;
			case "sunday":
			{
				System.out.println("Holiday");
			} break;
			default:{
				System.out.println("Invalid");
			}
		}
	}
}
