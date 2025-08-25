package Rabis;

public class CharNumber {
	public static void main(String[] args) {
		String s="a2b4m3",res="";
		for (int i = 0; i < s.length(); i+=2) {
			char c=s.charAt(i);
			int j=Integer.parseInt(s.charAt(i+1)+"");
			for (int j2 = 0; j2 < j; j2++) {
				res+=c;
			}
		}
		System.out.println(res);
	}
}
