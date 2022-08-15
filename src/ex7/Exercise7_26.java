package ex7;

public class Exercise7_26 {

	public static void main(String[] args) {
		
		//외부클래스 생성 없이 사용가능
		Outer2.Inner2 si = new Outer2.Inner2();
		System.out.println(si.iv);
		
	}

}

class Outer2{
	static class Inner2{
		int iv = 100;
	}
}