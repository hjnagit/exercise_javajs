package ex4;

public class Exercise4_4 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		
		for(i=1; true; i++) {
			if(i%2==0) {
				sum -= i;
			} else {
				sum += i;
			}
			
			if(sum >= 100) {
				break;
			}
		}
		System.out.println(i);
		
		//다른 방법
		int sum2 = 0;
		int s = 1; //값의 부호를 바꿔주는데 사용할 변수
		int num = 0;
		
		for(int i2=1; true; i2++, s=-s) {
			num = s*i2;
			sum2 += num;
			
			if(sum2 >= 100)
				break;
		}
		System.out.println(sum2);
		System.out.println(num);
		
		
	}

}
