package Practice;

public class AirConUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon aircon = new AirCon(); // aircon ��ü ����
		
		aircon.color = "white";
		aircon.temp = 10;
		aircon.price = 100000; // �������
		
		aircon.tempUp();
		System.out.println("aircon.temp="+aircon.temp+
				",aircon.color ="+aircon.color+",aircon.price="
				+aircon.price+"��");
		
		aircon.powerOn();
		aircon.powerOff();
		aircon.tempDown();
		aircon.price = 120000;
		aircon.color = "blue";
		
		System.out.println("aircon.temp="+aircon.temp+
				",aircon.color ="+aircon.color+",aircon.price="
				+aircon.price+"��"); // �޼ҵ���
	
	}

}
