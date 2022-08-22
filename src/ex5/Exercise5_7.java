package ex5;

import java.util.Scanner;

public class Exercise5_7 {

	public static void main(String[] args) {
		//�Ž����� �ݾ��� �Է¹޾� �������� �Ž�����
		//������ ������ ������ �Ž����ش�
//				
//		if(args.length != 1) {
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//		}
		Scanner sc = new Scanner(System.in);
				
		//���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻�
//		int money = Integer.parseInt(args[0]);
		int money = sc.nextInt();
				
		int[] coinUnit = {500, 100, 50, 10}; // ��������
		int[] coin = {5,5,5,5}; // ������ ������ ����
				
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			//�ݾ��� ���������� ������ �ʿ��� ������ ������ ���Ѵ�
			coinNum = money/coinUnit[i];
					
			//�ʿ��Ѹ�ŭ ������ ������ ����
			if(coinNum > coin[i]) {
				coinNum = coin[i];
				coin[i] = 0;
			}else {
				coin[i] -= coinNum;
			}
			//�ݾ׿��� �����ݾ׸�ŭ ����
			money -= coinUnit[i]*coinNum;
					
			System.out.println(coinUnit[i]+"��: " + coinNum);
		}
				
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0); //���α׷� ����
		}
				
		System.out.println("=���� ������ ����=");
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"��: " + coin[i]);
		}

	}

}
