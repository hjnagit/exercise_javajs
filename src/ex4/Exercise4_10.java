package ex4;

public class Exercise4_10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
//		String str = num+"";
//		
//		for(int i=0; i<str.length(); i++) {
//			sum += str.charAt(i)-'0';
//		}
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("sum=" + sum);
	}

}
