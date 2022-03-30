package Meeting_1;

public class AirConUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon airCon1 = new AirCon();
		
		// 변수 사용
		airCon1.color = "Black";
		airCon1.temp = 23;
		airCon1.price = 120000;
		
		// 메소드 사용
		airCon1.tempUp();
		System.out.println("aircon.temp="+airCon1.temp+
				",aircon.color ="+airCon1.color+",aircon.price="
				+airCon1.price+"원");
		
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();
		System.out.println("aircon.temp="+airCon1.temp+
				",aircon.color ="+airCon1.color+",aircon.price="
				+airCon1.price+"원");
		
		// 두 번째 객체 생성
		AirCon airCon2 = new AirCon();
		System.out.println("aircon.temp="+airCon2.temp+
				",aircon.color ="+airCon2.color+",aircon.price="
				+airCon2.price+"원");
		
	
		airCon2 = airCon1;
		airCon1.color = "Blue";
		airCon2.price = 33200;
		airCon2.color = "Purple";
		System.out.println("aircon.temp="+airCon2.temp+
				",aircon.color ="+airCon2.color+",aircon.price="
				+airCon2.price+"원");
		System.out.println("aircon.temp="+airCon1.temp+
				",aircon.color ="+airCon1.color+",aircon.price="
				+airCon1.price+"원");
		
		
	}

}
