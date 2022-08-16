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

// 물건 사는 사람
class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0; // cart의 인덱스
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
			return;
		}
			
		money -= p.price;
		//장바구니에 담는다
		add(p);
	}
	
	void add(Product p) {
		if(i >= cart.length) {
			Product[] tmp = new Product[cart.length*2];
			//기존의 장바구니의 내용을 새로운 배열에 복사한다
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		
		//물건을 장바구니에 저장하고 i값을 1증가시킨다
		cart[i++] = p;
	}
	
	void summary() {
		String itemList = "";
		int sum = 0;
		
		for(int i=0; i < cart.length; i++) {
			if(cart[i]==null)
				break;
			
			//장바구니에 담긴 물건들의 목록을 만들어 출력한다
			itemList += cart[i] + ", ";
			//목록의 가격을 모두 더해서 출력
			sum += cart[i].price;
		}
		
		System.out.println("구입한 물건 : " + itemList);
		System.out.println("물건의 총 가격 : " + sum);
		System.out.println("물건을 사고 남은 금액 : "+(money));
	}
	
	
}
//제품 조상
class Product{
	int price;
	
	Product(int price) {
		this.price = price;
	}
}
// 제품
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