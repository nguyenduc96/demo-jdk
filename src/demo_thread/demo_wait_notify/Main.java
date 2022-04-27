package demo_thread.demo_wait_notify;

public class Main {
    public static void main(String[] args) {
        DataShared dataShared = new DataShared();

        Sender sender = new Sender(dataShared);

        Receiver receiver = new Receiver(dataShared);

        sender.start();

        receiver.start();
    }
}
