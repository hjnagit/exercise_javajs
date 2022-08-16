package ex7;

public class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int prevChannel; // 이전 채널
	
	//이전 채널로 이동하는 메서드
	public void gotoPrevChannel() {
		setChannel(prevChannel); // 현재 채널을 이전 채널로 변경
	}

	
	public int getChannel() {
		return channel;
	}
	//입력값 유효성 검사하기
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		prevChannel = this.channel; // 현재 채널을 이전 채널에 저장
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	//입력값 유효성 검사하기
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		
		this.volume = volume;
	}
	
	
}
