package ex6;

public class Exercise6_6 {
	
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		// Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}

}
