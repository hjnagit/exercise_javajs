package ex7;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	//숫자카드 초기화하기
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i%10 +1;
			//1 3 8 둘 중의 한장은 광
			boolean isKwang = i<10 && (num==1||num==3||num==8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	//위치를 뒤섞는 shuffle
	public void shuffle() {
		for(int i=0; i< cards.length; i++) {
			int num = (int)(Math.random()*cards.length);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[num];
			cards[num] = tmp;
		}
	}
	
	//pick - 지정된 위치
	public SutdaCard pick(int index) {
		//유효성 체크
		if(index<0 || index>=CARD_NUM) return null;
		return cards[index];
	}
	
	//pick - 임의의 위치
	public SutdaCard pick() {
		int num = (int)(Math.random()*cards.length);
		return cards[num];
		// return pick(index); pick을 호출한다
	}
}
