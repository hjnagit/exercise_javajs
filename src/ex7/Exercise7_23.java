package ex7;

public class Exercise7_23 {
	//������ ���� ���ϴ� �޼���
	static double sumArea(Shape[] arr) {
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i].calcArea();
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("������ �� : " + sumArea(arr));
	}

}

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea(); //���� ����
	
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
	
} //shape

class Point{
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
} // Point

//��
class Circle extends Shape{
	double r; // ������
	
	Circle(double r){
		this(new Point(0,0), r);
	}
	Circle(Point p, double r){
		super(p);
		this.r = r;
	}
	
	@Override
	double calcArea() {
		return r*r*Math.PI;
	}
}//��

//���簢��
class Rectangle extends Shape{
	double width; //  ��
	double height; // ����
	
	Rectangle(double width, double height){
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p, double width, double height){
		super(p);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		return width*height;
	}
	
	//���簢�� Ȯ�� �޼���
	public boolean isSquare(){
		return width*height != 0 && width==height;
	}
	
	
}//���簢��

