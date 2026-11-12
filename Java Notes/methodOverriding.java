 class A{
     public void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    @Override
    public void display(){
        // super.display();  to call Parent class method
        System.out.println("Class B");
    }
}

public class methodOverriding{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}