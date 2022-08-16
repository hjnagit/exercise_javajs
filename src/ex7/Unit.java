package ex7;

// 추상클래스 만들기 상속하기

abstract class Unit {
	int x, y; // 현재위치
	
	abstract void move(int x, int y);
	
	void stop() { // 현재 위치에 정지
		
	}
}

class Marine extends Unit{
	@Override
	void move(int x, int y) {
	}
	void stimPack() {}
}

class Tank extends Unit{
	@Override
	void move(int x, int y) {
	}
	void changeMode() {}
}

class Dropship extends Unit{
	@Override
	void move(int x, int y) {
	}
	void load() {}
	void unload() {}
}
