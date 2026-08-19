
// Dynamic Method Dispatch - in the dynamic method dispatch, the method that is called determined at runtime based on the object being referred to, not the reference type. this is called dynamic method dispatch. it is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time. this is achieved through the use of polymorphism in object-oriented programming.

class A{
    public void method(){
        System.out.println("A");
    }
}

class B extends A{
    
    public void method(){
        System.out.println("B");
    }
}

class Index{
    public static void main(String a[]){
        A obj = new A();
        obj.method();

        obj = new B();
        obj.method();
    }
}