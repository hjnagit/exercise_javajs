package ex7;

public class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int prevChannel; // ���� ä��
	
	//���� ä�η� �̵��ϴ� �޼���
	public void gotoPrevChannel() {
		setChannel(prevChannel); // ���� ä���� ���� ä�η� ����
	}

	
	public int getChannel() {
		return channel;
	}
	//�Է°� ��ȿ�� �˻��ϱ�
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		prevChannel = this.channel; // ���� ä���� ���� ä�ο� ����
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	//�Է°� ��ȿ�� �˻��ϱ�
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		
		this.volume = volume;
	}
	
	
}
