package threads;

public class MyThread extends Thread {
    long sleepMills;
    String threadName;

    public MyThread(long sleepMills, String threadName) {
        super(threadName);
        this.sleepMills = sleepMills;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("[" + threadName + " strated" + "]");
        try {
            Thread.sleep(sleepMills);
        } catch (InterruptedException e) {
            System.out.println("InterrptedException was occurred in " + sleepMills);
        }
        System.out.println("[" + sleepMills + " finished" + "]");
    }
}
