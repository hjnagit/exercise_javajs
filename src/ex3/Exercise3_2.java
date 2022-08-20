package ex3;

public class Exercise3_2 {

	public static void main(String[] args) {
		//사과를 담는데 필요한 바구니의 수를 구하는 코드
		
		int numOfApple = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기
		int numOfBucket = numOfApple/sizeOfBucket + (numOfApple%sizeOfBucket == 0 ? 0 : 1);
		
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
		
	}

}
