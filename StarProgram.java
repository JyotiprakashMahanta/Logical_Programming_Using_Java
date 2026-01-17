package Basics;

public class StarProgram {
	public static void main(String[] args) {
		char c='A';int ii=1;
		for(int i=1;i<=26;i++) {
			System.out.println(c+""+ii+(char)(c+32));
			c++;ii++;
		}
	}
}
