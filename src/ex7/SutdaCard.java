package ex7;

public class SutdaCard {
	//원래 변수 앞에 final을 붙이면 선언과 초기화를 동시에 해야 한다
	//그러나 인스턴스 변수의 경우 선언시에 초기화 하지 않고 생성자에서 초기화할 수 있다
	//생성자에서 단 한 번의 초기화만 가능
	final int NUM;
	final boolean IS_KWANG;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	
	@Override
	public String toString() {
		return NUM + (IS_KWANG ? "K" : "");
	}
}
