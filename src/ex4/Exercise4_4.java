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
		
		//�ٸ� ���
		int sum2 = 0;
		int s = 1; //���� ��ȣ�� �ٲ��ִµ� ����� ����
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
