
public class InterfaceEX {
	public static void main(String [] args) {
		SmartTelevision tv = new SmartTelevision();
		tv.turnOn();
		tv.setVolume(5);
		tv.setMute(true);
		tv.setMute(false);
		tv.search("�ѱ��Ź�");
		tv.turnOff();
		RemoteControl.changeBattery();
	}
}
