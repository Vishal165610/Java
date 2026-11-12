class GrandParent{
    void car(){
        System.out.println("100 Cars");
    }
}

class Parent extends GrandParent{
    void bike(){
        System.out.println("10 Bikes");
    }
}

class Child extends Parent{
    void cycle(){
        System.out.println("1 Cycle");
    }
}

 public class MultilevelInheritance{
    public static void main(String a[]){

        Child c = new Child();

        c.cycle();
        c.car();
        c.bike();
    }
}