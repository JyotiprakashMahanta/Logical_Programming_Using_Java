package Rabis;

public class MaxOvalContainWord {
	public static void main(String[] args) {
		String s="Hey I am Jyotiprakash Mahanta What is your name aeio";
		String[] ar=s.split(" ");
		String max=ar[0];
		for (int i = 0; i < ar.length; i++) {
			int count=test(ar[i]);
			if (test(max)<count) {
				max=ar[i];
			}
		}
		System.out.println(max);
	}

	private static int test(String string) {
		int vowel=0;String v="aeiou";
		for (int i = 0; i < string.length(); i++) {
			if (v.contains(string.charAt(i)+"")) {
				vowel++;
			}
		}
		return vowel;
	}
}
