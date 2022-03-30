package Meeting_2;

class Sawon1{
	String name;
	String dept;
	int salary;
	
	String displayInfo() {
		return "이름: " + name +", 부서 : "+ dept + ", 연봉 : "+salary; 
	}
}
class Sales1 extends Sawon1{
	int commition;
	String displayInfo() {
	return super.displayInfo()+ ", 수당 : "+commition;
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sales sales = new Sales();
	sales.displayInfo();
	}
}
