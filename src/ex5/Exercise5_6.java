package ex5;

public class Exercise5_6 {

	public static void main(String[] args) {
		//거스름돈을 몇개의 동전으로 지불할 수 있는지 계산
		//가능한 한 적은 수의 동전으로 거슬러 주기
		int[] coinUnit = {500, 100, 50, 10}; // 내림차순
				
		int money = 2680;
		System.out.println("money=" + money);
				
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println( coinUnit[i]+ "원: " +money/coinUnit[i]);
			money %=coinUnit[i];
		}

	}

}
