package ex7;

public class SutdaCard {
	//���� ���� �տ� final�� ���̸� ����� �ʱ�ȭ�� ���ÿ� �ؾ� �Ѵ�
	//�׷��� �ν��Ͻ� ������ ��� ����ÿ� �ʱ�ȭ ���� �ʰ� �����ڿ��� �ʱ�ȭ�� �� �ִ�
	//�����ڿ��� �� �� ���� �ʱ�ȭ�� ����
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
