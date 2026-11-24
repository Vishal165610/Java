class Demo implements Runnable{
    public void run(){
        System.out.println("Thread is running...");
    }
}

public class threadingtry{
    public static void main(String a[]){
        Thread t = new Thread(new Demo());
        t.start();
    }
}