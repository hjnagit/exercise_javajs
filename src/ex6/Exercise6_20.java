package ex6;

import java.util.Arrays;

public class Exercise6_20 {
	
	static int[] shuffle(int[] arr) {
		//어떤값이 넘어올지 모르니까 유효성 체크를 꼭 한다
		if(arr==null || arr.length==0)
			return arr;
		
		for(int i=0; i < arr.length ; i++) {
			int j = (int)(Math.random()*arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
		
	}

}
