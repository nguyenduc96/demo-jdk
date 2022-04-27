package demo_thread.demo_wait_notify;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver extends Thread {
    private DataShared loadData;

    public Receiver(DataShared loadData) {
        this.loadData = loadData;
    }

    public Receiver() {
    }

    @Override
    public void run() {
        for(String receivedMessage = loadData.receive();
            !"End".equals(receivedMessage);
            receivedMessage = loadData.receive()) {
            System.out.println("Receiving");

            System.out.println(receivedMessage);

            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted " + e.getMessage());
            }
        }
    }
}
