package ex4;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		//숫자맞추기 게임
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // 사용자 입력
		int count = 0; // 시도횟수
//		System.out.println(answer);
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			
			if(input < answer) System.out.println("더 큰 수를 입력하세요.");
			else if(input > answer) System.out.println("더 작은 수를 입력세요.");
			
			if(input == answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break;
			}
		}while(true); // 무한 반복
		
	}

}
