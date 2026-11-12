class Demo extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class thread{
    public static void main(String[] args) {
        Thread t = new Demo();
        t.run();
    }
}
