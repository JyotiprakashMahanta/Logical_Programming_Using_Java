package Number_Program_2;

public class AutomorphicNumber2 {
	public static void main(String[] args) {
		int num=25,temp=num,pow=1;
		int squre=num*num;
		while (num!=0) {
			pow*=10;
			num/=10;
		}
		if (temp==(squre%pow)) {
			System.out.println("Automorphic Number");
		}else {
			System.out.println("Not a Automorphic Number");
		}
	}
}
