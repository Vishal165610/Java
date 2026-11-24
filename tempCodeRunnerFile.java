 class Main {

    public static void main(String[] args) {

        Main obj = new Main();

        Thread t1 = new Thread(() -> {
            obj.work();
        });

        Thread t2 = new Thread(() -> {
            obj.work();
        });

        t1.start();
        t2.start();
    }

    synchronized void work() {

        System.out.println(
            Thread.currentThread().getName() + " is working"
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}