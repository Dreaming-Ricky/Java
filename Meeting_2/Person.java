package Meeting_2;

public class Person {
	private int age;
	private String name;
	private String addr;

	public int getAge() { // get : private ������ ������ ��, ������ִ� �Լ�
		return age;
	}

	public void setAge(int age) { // set : ������ ���� �������ִ� �Լ�
		this.age = age; // int�� ���� age�� Person class(this ��� : �ڱ��ڽ��� ����Ű�� ����)��� ���� age������ �Ҵ�
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
