package ex4;

public class Exercise4_6 {

	public static void main(String[] args) {
		//두개의 주사위를 던져 눈의 합이 6이 되는 경우의 수
		int num = 0;
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(i+j == 6) {
					num++;
					System.out.println(i + "+" + j + "=" + (i+j));
				}
			}
		}
		
		System.out.println(num);
		
		
		
	}

}
