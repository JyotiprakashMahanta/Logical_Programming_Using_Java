package Rabis;

public class Anagram {
	public static void main(String[] args) {
		String s1="ArC".toUpperCase(),s2="CAR".toUpperCase();
		if (s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			sort(c1);
			sort(c2);
			boolean flag=true;
			for (int i = 0; i < c2.length; i++) {
				if (c1[i]!=c2[i]) {
					flag=false; break;
				}
			}
			if (flag) {
				System.out.println("yes it is a anagram");
			}else {
				System.out.println("letter missmatch not a anagram!");
			}
		}else {
			System.out.println("length not equals so not a anagram!");
		}
	}

	private static void sort(char[] c1) {
		for (int i = 0; i < c1.length; i++) {
			for (int j = i+1; j < c1.length; j++) {
				if (c1[i]>c1[j]) {
					char temp=c1[i];
					c1[i]=c1[j];
					c1[j]=temp;
				}
			}
		}		
	}
}
