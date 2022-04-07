package Practice;

public class VariableKind {
	int memVar; // 인스턴스 멤버 변수
	static int staticVar; // static 멤버 변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int localVar = 0; // 로컬 변수
		
		VariableKind vk1 = new VariableKind();
		System.out.println("vk1.memVar = "+vk1.memVar);
		System.out.println("vk.staticVar ="+vk1.staticVar);
		System.out.println("VariableKind.staticVar ="+VariableKind.staticVar);
		System.out.println("staticVar ="+staticVar);
		
		
		VariableKind vk2 = new VariableKind();
		vk1.staticVar = 20;
		System.out.println("vk2.staticVar ="+vk2.staticVar); // System.out.println("localVar ="+localVar); //왜 20이 출력되는지 이해하고 설명하기
		System.out.println("localVar ="+localVar);
	}
	
}// variablekind2 만들어서 static 접근시에는 오류가 뜨는지 알아보기
