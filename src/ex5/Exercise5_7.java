package ex5;

import java.util.Scanner;

public class Exercise5_7 {

	public static void main(String[] args) {
		//거슬러줄 금액을 입력받아 동전으로 거슬러줌
		//보유한 동전의 개수로 거슬러준다
//				
//		if(args.length != 1) {
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//		}
		Scanner sc = new Scanner(System.in);
				
		//문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생
//		int money = Integer.parseInt(args[0]);
		int money = sc.nextInt();
				
		int[] coinUnit = {500, 100, 50, 10}; // 동전단위
		int[] coin = {5,5,5,5}; // 단위별 동전의 개수
				
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			//금액을 동전단위로 나눠서 필요한 동전의 개수를 구한다
			coinNum = money/coinUnit[i];
					
			//필요한만큼 동전의 개수를 뺀다
			if(coinNum > coin[i]) {
				coinNum = coin[i];
				coin[i] = 0;
			}else {
				coin[i] -= coinNum;
			}
			//금액에서 동전금액만큼 뺀다
			money -= coinUnit[i]*coinNum;
					
			System.out.println(coinUnit[i]+"원: " + coinNum);
		}
				
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); //프로그램 종료
		}
				
		System.out.println("=남은 동전의 개수=");
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원: " + coin[i]);
		}

	}

}
