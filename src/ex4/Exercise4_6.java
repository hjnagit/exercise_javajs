package ex4;

public class Exercise4_6 {

	public static void main(String[] args) {
		//�ΰ��� �ֻ����� ���� ���� ���� 6�� �Ǵ� ����� ��
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
