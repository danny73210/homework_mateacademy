package threads;

public class MainOne {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(3000, "Thread3000");
        MyThread myThread2 = new MyThread(5000, "Thread5000");

        myThread1.start();
        myThread2.start();

        System.out.println("main method finished");
    }
}
