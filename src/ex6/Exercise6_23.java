package ex6;

import java.util.Arrays;

public class Exercise6_23 {
	
	static int max(int[] arr) {
		if(arr == null || arr.length == 0)
			return -999999;
		
		int max = Integer.MIN_VALUE; // ���� ���� ������ �ʱ�ȭ
		// �迭�� ù ��° ������ �ʱ�ȭ �ص� �ȴ� max = arr[0];
		for(int i=0; i<arr.length; i++) {
			max = Math.max(arr[i], max); // �Լ�����ؼ� ��
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3,4,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("�ִ밪 : " + max(data));
		System.out.println("�ִ밪 : " + max(null));
		System.out.println("�ִ밪 : " + max(new int[] {}));// ũ�Ⱑ 0�� �迭
		
	}

}
