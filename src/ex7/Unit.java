package ex7;

// �߻�Ŭ���� ����� ����ϱ�

abstract class Unit {
	int x, y; // ������ġ
	
	abstract void move(int x, int y);
	
	void stop() { // ���� ��ġ�� ����
		
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
