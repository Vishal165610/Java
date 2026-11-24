class Demo implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Multithreading {
    public static void main(String args[]) {
        Demo obj = new Demo();
        Thread thread = new Thread(obj);
        thread.start();
    }
}

//Multithreading is a programming technique that allows multiple threads to run concurrently within a single program. In the provided code snippet, we have a class `Demo` that implements the `Runnable` interface. The `run()` method is overridden to define the code that will be executed when the thread is started.


//how can we create multiple threads in the same program?
// To create multiple threads in the same program, you can create multiple instances of the `Thread` class, each associated with a different `Runnable` object or the same `Runnable` object. Here’s an example of how to create and start multiple threads:

// Example of creating multiple threads
// class Demo implements Runnable {
//     private String threadName;

//     public Demo(String name) {
//         this.threadName = name;
//     }

//     public void run() {
//         System.out.println(threadName + " is running...");
//     }
// }
// Daemon threads are a special type of thread that run in the background and do not prevent the program from terminating. In this code, we create an instance of the `Demo` class and pass it to a new `Thread` object. When we call `thread.start()`, it invokes the `run()` method in a separate thread, allowing the main program to continue executing concurrently with the thread's execution.

