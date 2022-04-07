package Meeting_2;

public class InstanceOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		President president1 = new President();

		Person person1 = president1;

		if (person1 instanceof President) {
			President president2 = (President) person1;
			System.out.println("Person1을 President 타입으로 캐스팅 성공.");
		} else {
			System.out.println("person1을 캐스팅 할 수 없다.");
		}
		Person person2 = new Person();

		if (person2 instanceof President) {
			President president3 = (President) person2;
			System.out.println("person2를 President 타입으로 캐스팅 성공");
		} else {
			System.out.println("person2를 캐스팅할 수 없다.");
		}
		
	
	}

}
