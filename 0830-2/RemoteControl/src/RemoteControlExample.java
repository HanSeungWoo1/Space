
public class RemoteControlExample {

	public static void main(String[] args) {
		
		
		RemoteControl rc1 = new Audio();
		rc1.turnOn();
		rc1.turnOff();
	/*	
		rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolune(6);
		rc.turnOff();
		
		Searchable sc = new SmartTelevision();
		sc.search("www.naver.com");
		
		SmartTelevision st = new SmartTelevision();
		st.turnOn();
		st.search("www.google.com");
		st.turnOff();
		*/
		RemoteControl rc2 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("RemoteControl - turnOn()");
				
			}
			
			
			@Override
			public void turnOff() {
				
				System.out.println("RemoteControl - turnOff()");
				
			}
			
			@Override
			public void setVolume(int volume) {
				
				
				
			}
		};
	
		rc2.turnOn();
		rc2.turnOff();

	}

}
