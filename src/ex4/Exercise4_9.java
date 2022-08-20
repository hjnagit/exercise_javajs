package ex4;

public class Exercise4_9 {

	public static void main(String[] args) {
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			//charAt i번째 문자열을 반환한다
			//문자코드니까 0을 빼서 숫자로 인식되게...
			sum += str.charAt(i) - '0';
		}
		System.out.println("sum=" + sum);
		
	}

}
