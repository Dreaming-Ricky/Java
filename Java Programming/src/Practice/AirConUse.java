package Practice;

public class AirConUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon aircon = new AirCon(); // aircon 객체 생성
		
		aircon.color = "white";
		aircon.temp = 10;
		aircon.price = 100000; // 변수사용
		
		aircon.tempUp();
		System.out.println("aircon.temp="+aircon.temp+
				",aircon.color ="+aircon.color+",aircon.price="
				+aircon.price+"원");
		
		aircon.powerOn();
		aircon.powerOff();
		aircon.tempDown();
		aircon.price = 120000;
		aircon.color = "blue";
		
		System.out.println("aircon.temp="+aircon.temp+
				",aircon.color ="+aircon.color+",aircon.price="
				+aircon.price+"원"); // 메소드사용
	
	}

}
