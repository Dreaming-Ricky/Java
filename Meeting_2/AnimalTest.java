package Meeting_2;

public class AnimalTest {
	public static void main(String[] args) {
	    
    	//01. upcasting
        
		Birds b = new Birds();    //birds 객체생성
		System.out.println(b);    //객체 확인, 결과 : Bird 입니다
		
		
		Animal a = b;             //birds를 Animal타입으로 upcasting (자동형변환)
		System.out.println(a);    //결과 : Bird 입니다
	
        //02. downcasting
        
		Birds b2 = (Birds) a;     //upcasting한 a를 다시 birds로 downcasting
		System.out.println(b2);   //downcasting은 명시적형변환이 필요하다.
		                          //결과 : Bird 입니다
                                  
        //03. downcasting 실패하는 경우
        
		if(b2 instanceof Eagle) { //b2가 Eagle의 인스턴스인지 확인하는 코드
		Eagle e = (Eagle) b2;     //b2를 Eagle로 downcasting (명시적형변환)
		System.out.println(e);    
		}else {
			System.out.println("다운캐스팅 불가");  //결과 : "다운캐스팅 불가"
		}
		
	
	}
	
}	
	
