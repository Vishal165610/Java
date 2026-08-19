class A{

    int age = 10;

    public void display(){
        System.out.println("Age: " +age);
    }

    class B{

        public void show(){
            System.out.println("Age from inner class: " +age);
        }
    }
}

class InnerClass{
    public static void main(String a[]){

        A obj = new A();
        obj.display();

        A.B obj1 = obj.new B();
        obj1.show();
    }
}