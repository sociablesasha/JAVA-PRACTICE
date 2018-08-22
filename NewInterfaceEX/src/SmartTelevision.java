
public class SmartTelevision 
			implements RemoteControl, Searchable {
	private int volume;
	
	public void search(String url) {
		System.out.println(url);
	}
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if(volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else {
			this.volume = volume;
		}
		System.out.println("TV의 현재 볼륨은 " + this.volume + "입니다.");
	}

	public void setVolume() {}
	
}
