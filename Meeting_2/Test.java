package Meeting_2;

public class Test {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car2 carObject = new Car2();
 
        // 값을 직접 대입할 수 없다.
        //carObject.fuel = 10;
        
        carObject.setFuel(20);
        System.out.println("10을 인자로 넣었을 때 :" + carObject.getFuel());
        
        carObject.setFuel(-50);
        System.out.println("음수를 인자로 넣었을 때 :" + carObject.getFuel());
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
            System.out.println("fuel 값이 올바르지 않습니다.");
        }
    }
    
    int getFuel () {
        return this.fuel;
    }
}
