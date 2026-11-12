abstract class Car{

    public abstract void drive();

}

class WagnoR extends Car{
    
    public void drive(){
        
        System.out.println("WagnoR is driving");    
    }
}


class AbstractClass{
    public static void main(String a[]){

        Car obj = new WagnoR();
        obj.drive();
    }
}