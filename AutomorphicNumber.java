package Number_Program_2;

public class AutomorphicNumber {

	public static void main(String[] args) {
		int num=65;
		int squre=num*num;
		boolean flag=true;
		while (num!=0) {
			int n=num%10;
			int s=squre%10;
			if (n!=s) {
				flag=false;
				break;
			}
			num/=10;
			squre/=10;
		}
		if (flag) {
			System.out.println("Automorphic Number");
		}else {
			System.out.println("Not a Automorphic Number");
		}
	}

}
