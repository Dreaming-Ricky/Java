package Meeting_2;

class Sawon1{
	String name;
	String dept;
	int salary;
	
	String displayInfo() {
		return "�̸�: " + name +", �μ� : "+ dept + ", ���� : "+salary; 
	}
}
class Sales1 extends Sawon1{
	int commition;
	String displayInfo() {
	return super.displayInfo()+ ", ���� : "+commition;
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sales sales = new Sales();
	sales.displayInfo();
	}
}
