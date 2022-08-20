package ex4;

public class Exercise4_8 {

	public static void main(String[] args) {
		//2x+4y=10 의 해구하기
		
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if((2*i + 4*j) == 10) {
					System.out.println("x=" + i + ", y=" + j);
				}
			}
		}
		
		
	}

}
