package ex4;

public class Exercise4_15 {

	public static void main(String[] args) {
		//ȸ���� : ���ڸ� �Ųٷ� �о ������ �о ���� ��
		
		int number = 1234321;
		int tmp = number;
		
		int result = 0; // �ѹ��� �Ųٷ��ؼ� ���� ����
		
		while(tmp!=0) {
			result = result*10 + tmp%10; // ���� ����� 10�� ���ؼ� ���Ѵ�
			tmp /= 10;
		}
		
		if(number == result) {
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		} else {
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
		}
		
		
	}

}
