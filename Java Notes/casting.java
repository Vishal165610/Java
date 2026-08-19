class A{
    public void show1(){
        System.out.println("This is a method of class A.");
    }
}

class B extends A{
    public void show2(){
        System.out.println("This is a method of class B.");
    }
}

class Casting{
    public static void main(String a[]){

        A obj = new B();
        obj.show1();
        // this is called upcasting, where the reference type is of the parent class and the object type is of the child class. in this case, we can only access the methods of the parent class using the reference variable obj. we cannot access the methods of the child class using the reference variable obj.

        B obj1 = (B) obj;
        obj1.show1();
        obj1.show2();
        // this is called downcasting, where the reference variable is of the child class and the object type is of the parent class, in this case, we can access the methods of the child class using the reference variable obj1. we can also access the methods of the parent class using the reference variable obj1.
    }
}