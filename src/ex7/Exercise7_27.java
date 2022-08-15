package ex7;

public class Exercise7_27 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.Inner3 in = out.new Inner3();
		in.method1();
	}

}

class Outer3{
	int value = 10;
	
	class Inner3{
		int value = 20;
		
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
		
	}//inner
}//outer