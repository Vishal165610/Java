// abstract class Computer{
//     public abstract void code();                // it works finely but what if instead of using the class we use interface things will be same but more clean and understandable
// }

interface Computer{
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, run, compile");
    }
}

class Laptop implements Computer{

    public void code(){
        System.out.println("code, run, compile");
    }
}

class Developer{
    public void code(Computer lap){
        lap.code();
    }
}

public class NeedInterface{
    public static void main(String a[]){

        Desktop desk = new Desktop();
        Laptop lap = new Laptop();
        Developer dev = new Developer();

        dev.code(lap);
    }
}