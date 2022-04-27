package demo_thread;

public class ThreadTwo extends Thread{
    ThreadOne threadOne;

    ThreadTwo(ThreadOne threadOne) {
        this.threadOne = threadOne;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (threadOne.isAlive()) {
                try {
                    threadOne.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("thread 2 run......... " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
