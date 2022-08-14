package ex6;

public class Exercise6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		//p�� (2,2)���� �Ÿ��� ���Ѵ�
		System.out.println(p.getDistance(2, 2));
	}

}

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x1, int y1) {
		return Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2));
	}
}