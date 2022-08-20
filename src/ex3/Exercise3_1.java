package ex3;

public class Exercise3_1 {

	public static void main(String[] args) {
		//자바의 연산결과
		int x = 2;
		int y = 5;
		char c = 'A'; // A의 문자코드 65
		
		System.out.println(1 + x << 33); //??? << 연산자 체크
		//<<는 왼쪽으로 한칸씩 옮기는 것
		//int 32bit -> 3 << 1 -> 3*2 -> 6
		System.out.println(y >= 5 || x < 0 && x > 2); //true
		System.out.println(y += 10 - x++); //x값이 증가되지 않은 상태에서 계산
		//x=3 y=13
		System.out.println(x+=2); //x=5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		System.out.println('C' - c); // 2
		// 피연산자가 int보다 작은 타입(byte short char) int로 변환하여 연산
		System.out.println('5' - '0'); //5
		System.out.println(c+1); //66
		System.out.println(++c); //67 B
		System.out.println(c++); // 67B c=68C
		System.out.println(c); // 68C
		
	}

}
