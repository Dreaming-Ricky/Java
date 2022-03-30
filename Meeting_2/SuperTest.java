package Meeting_2;

class Sawon{
	String name;
	String dept;
	int salary;
	
	String displayInfo() {
		return "이름: " + name +", 부서 : "+ dept + ", 연봉 : "+salary; 
	}
}
class Sales extends Sawon{
	int commition;
	String displayInfo() {
	System.out.println(super.displayInfo() + ", 수당 : " +commition);
	return name;
	}
}

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sales sales = new Sales();
	sales.displayInfo();

	}

}
