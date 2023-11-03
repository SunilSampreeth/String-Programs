package string.basic;

import java.util.Scanner;

public class Geeks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i = i + 2) {
			System.out.print(ch[i]);

		}
		String s=" ";
		for (int i = 1; i < ch.length; i = i + 2) {
				s+=ch[i];
		}
		System.out.print(s);

	}

}
//i/p:geeks ,o/p:ges ek



