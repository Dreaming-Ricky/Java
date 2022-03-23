package Practice;

public class VariableKind {
	int memVar; // 인스턴스 멤버 변수
	static int staticVar; // static 멤버 변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int localVar = 0; // 로컬 변수
		
		VariableKind vk1 = new VariableKind();
		System.out.println("vk1.memVar = " +vk1.memVar);
		System.out.println("vk.staticVar ="+vk1.staticVar);
		System.out.println("VariableKind.staticVar ="+VariableKind.staticVar);
		System.out.println("staticVar ="+staticVar);
		
		
		VariableKind vk2 = new VariableKind();
		staticVar = 20;
		System.out.println("vk2.staticVar ="+vk2.staticVar); // System.out.println("localVar ="+localVar);
		System.out.println("localVar ="+localVar);
	}
	
}
