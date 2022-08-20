package ex3;

public class Exercise3_10 {

	public static void main(String[] args) {
		//대문자일때 소문자로 변경
		char ch = 'A';
		
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
