package string.basic;

public class LargestWord {
public static void main(String[] args) {
	String str= "welcome to bangalore";
	 String[] sp = str.split(" ");
	String s=sp[0];
	 for(int i=1; i<sp.length; i++) {
		if(s.length()<sp[i].length()) {
			s=sp[i];
		}
	 }
	 System.out.println(s);
	
}
}
