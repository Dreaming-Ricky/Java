package Meeting_2;

public class Test {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car2 carObject = new Car2();
 
        // ���� ���� ������ �� ����.
        //carObject.fuel = 10;
        
        carObject.setFuel(20);
        System.out.println("10�� ���ڷ� �־��� �� :" + carObject.getFuel());
        
        carObject.setFuel(-50);
        System.out.println("������ ���ڷ� �־��� �� :" + carObject.getFuel());
    }

}


class Car2
{
    private int fuel;
    
    void setFuel ( int inputFuel ) {
        if ( inputFuel > 0 && inputFuel <= 100) {
            this.fuel = inputFuel;
        }
        else {
            System.out.println("fuel ���� �ùٸ��� �ʽ��ϴ�.");
        }
    }
    
    int getFuel () {
        return this.fuel;
    }
}
