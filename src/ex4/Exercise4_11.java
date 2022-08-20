package ex4;

public class Exercise4_11 {

	public static void main(String[] args) {
		//파보나치수열
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; //3번째
		System.out.print(num1+","+num2);
		
		for(int i=0; i<8; i++) {
			num3 = num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(","+num3);
		}
		
		
	}

}
