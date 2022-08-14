package ex6;

import java.util.Arrays;

public class Exercise6_23 {
	
	static int max(int[] arr) {
		if(arr == null || arr.length == 0)
			return -999999;
		
		int max = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
		// 배열의 첫 번째 값으로 초기화 해도 된다 max = arr[0];
		for(int i=0; i<arr.length; i++) {
			max = Math.max(arr[i], max); // 함수사용해서 비교
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3,4,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));// 크기가 0인 배열
		
	}

}
