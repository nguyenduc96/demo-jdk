package demo_thread.demo_wait_notify;

import java.util.concurrent.ThreadLocalRandom;

public class Sender extends Thread {
    private DataShared dataShared;

    public Sender(DataShared dataShared) {
        this.dataShared = dataShared;
    }

    public Sender() {
    }

    @Override
    public void run() {
        String[] packets = {
                "Mess 1",
                "Mess 2",
                "Mess 3",
                "Mess 4",
                "Mess 5"
        };

        for (String str : packets) {
            System.out.println("Sending....");
            dataShared.send(str);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted " + e.getMessage());
            }
        }
    }
}
