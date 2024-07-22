import java.util.Scanner;
class Program5 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		double org_price=input.nextDouble();
		double aft_dis_price=org_price;
		if (age>=13 && age<=19)
		{
			aft_dis_price=org_price-(org_price*0.05);
			if (aft_dis_price>5000)
			{
				aft_dis_price=aft_dis_price-(aft_dis_price*0.05);
			}
		}
		else if (20<=age && age<=29)
		{
			aft_dis_price=org_price-(org_price*0.06);
			if (aft_dis_price>4000)
			{
				aft_dis_price=aft_dis_price-(aft_dis_price*0.06);
			}
		}
		else if (29<age)
		{
			aft_dis_price=org_price-(org_price*0.15);
		}
		System.out.println(org_price);
		System.out.println(aft_dis_price);
		System.out.println(org_price-aft_dis_price);
	}
}
