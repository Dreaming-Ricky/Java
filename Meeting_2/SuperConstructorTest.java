package Meeting_2;

class Sawon2 {
	String name;
	String dept;
	int salary;

	public Sawon2(String name, String dept, int salary) {
		// super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	String displayInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
	
	}
}

class Sales2 extends Sawon2 {
	int commition;

	public Sales2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
		this.commition = commition;
	}

	String displayInfo() {
		return super.displayInfo() + ", 수당 : " + commition;

	}
}

public class SuperConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales2 sales2 = new Sales2("나준희", "경영관리부", 100000000, 7000000);
		System.out.println(sales2.displayInfo());
	}
}
