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

    public void run(){
        System.err.println("Running...");
    }

    public void walk(){
        System.err.println("Walking...");
    }

    public void sit(){
        System.err.println("sitting...");
    }

    public void stand(){
        System.err.println("Standing...");
    }

    public void sleep(){
        System.err.println("sleeping...");
    }

    public void wake(){
        System.err.println("waked up...");
    }
}

public class MultipleInterface{

    public static void main(String a[]){

        A obj = new D();
        obj.run();

        C obj1 = new D();
        obj1.sleep();
    }
}