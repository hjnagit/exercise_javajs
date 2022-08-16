package ex7;

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}

// ���� ��� ���
class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0; // cart�� �ε���
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� ��� �����ϴ�.");
			return;
		}
			
		money -= p.price;
		//��ٱ��Ͽ� ��´�
		add(p);
	}
	
	void add(Product p) {
		if(i >= cart.length) {
			Product[] tmp = new Product[cart.length*2];
			//������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		
		//������ ��ٱ��Ͽ� �����ϰ� i���� 1������Ų��
		cart[i++] = p;
	}
	
	void summary() {
		String itemList = "";
		int sum = 0;
		
		for(int i=0; i < cart.length; i++) {
			if(cart[i]==null)
				break;
			
			//��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�
			itemList += cart[i] + ", ";
			//����� ������ ��� ���ؼ� ���
			sum += cart[i].price;
		}
		
		System.out.println("������ ���� : " + itemList);
		System.out.println("������ �� ���� : " + sum);
		System.out.println("������ ��� ���� �ݾ� : "+(money));
	}
	
	
}
//��ǰ ����
class Product{
	int price;
	
	Product(int price) {
		this.price = price;
	}
}
// ��ǰ
class Tv extends Product{
	Tv(){
		super(100);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}