class A{
    public final void showlogs(){
        System.out.println("This is a final method.");
    }
}

// class B extends A{
//     public void showlogs(){ // compile time error: cannot override final method from A
//         System.out.println("This is a non-final method.");
//     }
// }

class B{
    final int MAX_VALUE = 100; // this value cannot be changed once initialized
    final int MIN_VALUE; // this value can be initialized in the constructor

    public B(int minValue){
        this.MIN_VALUE = minValue; // final variable can be initialized only in the constructor
    }
}

final class C{ // this final class cannot be extended by any other class and cannot be subclassed 
    public void display(){
        System.out.println("This is a final class."); 
    }
}

class Final{
    public static void main(String a[]){

        A objA = new A();
        objA.showlogs();

        B objB = new B(10);
        System.out.println("MAX_VALUE: " + objB.MAX_VALUE);
        System.out.println("MIN_VALUE: " + objB.MIN_VALUE);

        C objC = new C();
        objC.display();
    }
}