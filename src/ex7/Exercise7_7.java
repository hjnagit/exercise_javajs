package ex7;

public class Exercise7_7 {

	public static void main(String[] args) {
		// �������� ���� ����
		Child c = new Child();
						
		System.out.println("x=" + c.getX());
	}

}

class Parent{
	int x = 100;
	
	Parent(){
		this(200);
		//�����ڿ��� �����ڸ� ȣ���� �� ���� ���� �;��Ѵ�
		//��¹��� ���� ���� ������ ����!!
		System.out.println("�θ� �⺻");
	}
	
	Parent(int x){
		this.x = x;
		System.out.println("�θ�2");
	}
	
	int getX() {
		return x;
	}
	
}

class Child extends Parent{
	int x = 3000;
	
	Child(){
		this(1000);
		System.out.println("�ڽı⺻");
	}
	
	Child(int x){
		System.out.println("�ڽ�2");
		this.x = x;
	}
}