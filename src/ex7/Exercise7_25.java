package ex7;

public class Exercise7_25 {

	public static void main(String[] args) {
		//�ܺ�Ŭ���� ���� �� ����Ŭ���� ����! ���� ����!!
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		System.out.println(in.iv);
		
	}

}


class Outer{
	class Inner{
		int iv = 100;
	}
}