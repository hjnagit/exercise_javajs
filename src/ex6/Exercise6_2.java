package ex6;

public class Exercise6_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}
}
class SutdaCard{
	int num;
	boolean isKawng;
	
	SutdaCard(){
//		num = 1;
//		isKawng = true;
		//�����ڸ� ȣ���ؼ� �ʱⰪ�� �����Ѵ�
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKawng){
		this.num = num;
		this.isKawng = isKawng;
	}
	
	String info() {
		return num + (isKawng ? "K" : "");
	}
}