interface A{
    void run();
    void walk();
}

interface B{
    void sit();
    void stand();
}

interface C extends B{
    void sleep();
    void wake();
}

class D implements A,C{
    public void run() {
        System.out.println("running..");
    }

    public void walk() {
        System.out.println("Walking..");
    }

    public void sit() {
        System.out.println("sitting..");
    }
    
    public void stand() {
        System.out.println("standing..");
    }
    public void sleep() {
        System.out.println("sleeping..");
    }
    public void wake() {
        System.out.println("waking up..");
    }
}

public class MultipleInterface{
    public static void main(String a[]){
        A obj = new D();
        obj.run();
        obj.walk();

        C obj1 = new D();
        obj1.sleep();
        obj1.wake();

        B obj2 = new D();
        obj2.sit();
        obj2.stand();
    }
}