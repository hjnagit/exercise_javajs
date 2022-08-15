package ex7;

public class Exercise7_25 {

	public static void main(String[] args) {
		//외부클래스 생성 후 내부클래스 생성! 문법 주의!!
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