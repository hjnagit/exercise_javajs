package ex7;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	//����ī�� �ʱ�ȭ�ϱ�
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i%10 +1;
			//1 3 8 �� ���� ������ ��
			boolean isKwang = i<10 && (num==1||num==3||num==8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	//��ġ�� �ڼ��� shuffle
	public void shuffle() {
		for(int i=0; i< cards.length; i++) {
			int num = (int)(Math.random()*cards.length);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[num];
			cards[num] = tmp;
		}
	}
	
	//pick - ������ ��ġ
	public SutdaCard pick(int index) {
		//��ȿ�� üũ
		if(index<0 || index>=CARD_NUM) return null;
		return cards[index];
	}
	
	//pick - ������ ��ġ
	public SutdaCard pick() {
		int num = (int)(Math.random()*cards.length);
		return cards[num];
		// return pick(index); pick�� ȣ���Ѵ�
	}
}
