package Meeting_2;

public class Person {
	private int age;
	private String name;
	private String addr;

	public int getAge() { // get : private 변수에 접근할 때, 사용해주는 함수
		return age;
	}

	public void setAge(int age) { // set : 변수의 값을 세팅해주는 함수
		this.age = age; // int형 인자 age를 Person class(this 사용 : 자기자신을 가리키는 역할)멤버 변수 age변수에 할당
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
