class Threading implements Runnable{
    private String threadName;
    public Threading(String name){
        this.threadName = name;
    }
    public void run(){
        System.out.println(threadName + " is running...");
    }
}

public class MultithreadingExample{
    public static void main(String a[]){
        Thread t1 = new Thread(new Threading("Thread 1"));
        Thread t2 = new Thread(new Threading("Thread 2"));
        Thread t3 = new Thread(new Threading("Thread 3"));
    
        t1.start();
        t2.start();
        t3.start();


        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());

    }
}