package oop2.week5.lecture1;

public class ThreadsTest extends Thread {

    public void run() {
        NonSingletonTest ts = new NonSingletonTest();
        String threadId = "thread ^" + Thread.currentThread().getId();
        ts.spam("Threads.exe", threadId);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            ThreadsTest thread = new ThreadsTest();
            thread.start();
        }
        //sequential run:
//        NonSingletonTest seq = new NonSingletonTest();
//        String threadId = "thread ^" + Thread.currentThread().getId();
//        seq.spam("Threads.exe", threadId);

    }
}
