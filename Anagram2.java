package Rabis;

public class Anagram2 {
	public static void main(String[] args) {
		String s = "Stop ARC Silent CAR Listen Po t";
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			char[] c1 = str[i].toLowerCase().toCharArray();
			for (int j = i + 1; j < str.length; j++) {
				char[] c2 = str[j].toLowerCase().toCharArray();
				if (c1.length == c2.length) {
					sort(c1);
					sort(c2);
					boolean flag = true;
					for (int k = 0; k < c2.length; k++) {
						if (c1[k] != c2[k]) {
							flag = false;
							break;
						}
					}
					if (flag) {
						System.out.println(str[i]+"->"+str[j]);
					}
				}
			}
		}
	}

	private static void sort(char[] c1) {
		for (int i = 0; i < c1.length; i++) {
			for (int j = i + 1; j < c1.length; j++) {
				if (c1[i] > c1[j]) {
					char temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}
			}
		}
	}
}
