package ex3;

public class Exercise3_1 {

	public static void main(String[] args) {
		//�ڹ��� ������
		int x = 2;
		int y = 5;
		char c = 'A'; // A�� �����ڵ� 65
		
		System.out.println(1 + x << 33); //??? << ������ üũ
		//<<�� �������� ��ĭ�� �ű�� ��
		//int 32bit -> 3 << 1 -> 3*2 -> 6
		System.out.println(y >= 5 || x < 0 && x > 2); //true
		System.out.println(y += 10 - x++); //x���� �������� ���� ���¿��� ���
		//x=3 y=13
		System.out.println(x+=2); //x=5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		System.out.println('C' - c); // 2
		// �ǿ����ڰ� int���� ���� Ÿ��(byte short char) int�� ��ȯ�Ͽ� ����
		System.out.println('5' - '0'); //5
		System.out.println(c+1); //66
		System.out.println(++c); //67 B
		System.out.println(c++); // 67B c=68C
		System.out.println(c); // 68C
		
	}

}
