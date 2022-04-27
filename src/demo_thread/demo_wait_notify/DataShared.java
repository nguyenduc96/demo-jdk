package demo_thread.demo_wait_notify;

public class DataShared {
    private String packet;

    boolean isShared = true;


    public synchronized String receive() {
        while (isShared) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isShared = true;

        String returnPacket = packet;

        notifyAll();

        return returnPacket;
    }

    public synchronized void send(String packet) {
        while (!isShared) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        isShared = false;

        this.packet = packet;

        notifyAll();
    }
}
