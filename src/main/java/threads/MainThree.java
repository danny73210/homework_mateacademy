package threads;

public class MainThree {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(3000, "Thread_1");
        MyThread myThread2 = new MyThread(5000, "Thread_2");
        myThread1.setDaemon(true);
        myThread2.setDaemon(true);
        myThread1.start();

        try {
            myThread1.join(500);
            System.out.println("thread1 is finished");
        } catch (InterruptedException e) {
            e.getMessage();
        }

        myThread2.start();
        System.out.println("Main method finished!");
    }
}
