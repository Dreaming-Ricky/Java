package Meeting_2;

public class CastingTest {

	public static void main(String[] args) {
		President president1 = new President();
		
		Person person1 = president1; // 업캐스팅( 자식 -> 부모로 형변환)
		
		President president2 = (President)person1;
		
		Person person2 = new Person();
		
		President president3 = (President)person2;
		President president4 = (President) person2;  
		
		//Student student = (Student)president2;

	}
}