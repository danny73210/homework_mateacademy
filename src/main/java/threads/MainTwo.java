package threads;

public class MainTwo {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(3000, "Thread_1");
        MyThread myThread2 = new MyThread(5000, "Thread_2");
        myThread1.start();

        try {
            //myThread1.join(500);
            myThread1.join(5000);
            System.out.println("MyThread is finished!");
        } catch (InterruptedException e) {
            e.getMessage();
        }

        myThread2.start();
        System.out.println("Main method finished!");
    }
}
