package ex3;

public class Exercise3_2 {

	public static void main(String[] args) {
		//����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� �ڵ�
		
		int numOfApple = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��
		int numOfBucket = numOfApple/sizeOfBucket + (numOfApple%sizeOfBucket == 0 ? 0 : 1);
		
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
		
		
	}

}
