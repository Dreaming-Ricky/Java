package Meeting_2;

public class AnimalTest {
	public static void main(String[] args) {
	    
    	//01. upcasting
        
		Birds b = new Birds();    //birds ��ü����
		System.out.println(b);    //��ü Ȯ��, ��� : Bird �Դϴ�
		
		
		Animal a = b;             //birds�� AnimalŸ������ upcasting (�ڵ�����ȯ)
		System.out.println(a);    //��� : Bird �Դϴ�
	
        //02. downcasting
        
		Birds b2 = (Birds) a;     //upcasting�� a�� �ٽ� birds�� downcasting
		System.out.println(b2);   //downcasting�� ���������ȯ�� �ʿ��ϴ�.
		                          //��� : Bird �Դϴ�
                                  
        //03. downcasting �����ϴ� ���
        
		if(b2 instanceof Eagle) { //b2�� Eagle�� �ν��Ͻ����� Ȯ���ϴ� �ڵ�
		Eagle e = (Eagle) b2;     //b2�� Eagle�� downcasting (���������ȯ)
		System.out.println(e);    
		}else {
			System.out.println("�ٿ�ĳ���� �Ұ�");  //��� : "�ٿ�ĳ���� �Ұ�"
		}
		
	
	}
	
}	
	
