package ex4;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		//���ڸ��߱� ����
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // ����� �Է�
		int count = 0; // �õ�Ƚ��
//		System.out.println(answer);
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			input = s.nextInt();
			
			if(input < answer) System.out.println("�� ū ���� �Է��ϼ���.");
			else if(input > answer) System.out.println("�� ���� ���� �Է¼���.");
			
			if(input == answer) {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
				break;
			}
		}while(true); // ���� �ݺ�
		
	}

}
