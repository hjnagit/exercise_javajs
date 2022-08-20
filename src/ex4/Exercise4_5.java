package ex4;

public class Exercise4_5 {

	public static void main(String[] args) {
		//for문 while 문으로 변경
		int i = 0;
		while(i<=10) {
			int j = 0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
	}

}
