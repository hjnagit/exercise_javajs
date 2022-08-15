package ex7;

public class Exercise7_7 {

	public static void main(String[] args) {
		// 생성자의 실행 순서
		Child c = new Child();
						
		System.out.println("x=" + c.getX());
	}

}

class Parent{
	int x = 100;
	
	Parent(){
		this(200);
		//생성자에서 생성자를 호출할 때 가장 먼저 와야한다
		//출력문을 제일 위에 적으면 오류!!
		System.out.println("부모 기본");
	}
	
	Parent(int x){
		this.x = x;
		System.out.println("부모2");
	}
	
	int getX() {
		return x;
	}
	
}

class Child extends Parent{
	int x = 3000;
	
	Child(){
		this(1000);
		System.out.println("자식기본");
	}
	
	Child(int x){
		System.out.println("자식2");
		this.x = x;
	}
}