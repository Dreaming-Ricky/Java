package Practice;

public class AirConUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon airCon1 = new AirCon();
		
		// ���� ���
		airCon1.color = "Black";
		airCon1.temp = 23;
		airCon1.price = 120000;
		
		// �޼ҵ� ���
		airCon1.tempUp();
		System.out.println("aircon.temp="+airCon1.temp+
				",aircon.color ="+airCon1.color+",aircon.price="
				+airCon1.price+"��");
		
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();
		System.out.println("aircon.temp="+airCon1.temp+
				",aircon.color ="+airCon1.color+",aircon.price="
				+airCon1.price+"��");
		
		// �� ��° ��ü ����
		AirCon airCon2 = new AirCon();
		System.out.println("aircon.temp="+airCon2.temp+
				",aircon.color ="+airCon2.color+",aircon.price="
				+airCon2.price+"��");
		
		airCon2 = airCon1;
		System.out.println("aircon.temp="+airCon2.temp+
				",aircon.color ="+airCon2.color+",aircon.price="
				+airCon2.price+"��");
	}

}
