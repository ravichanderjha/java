class Message {
    private String content;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return content;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        this.content = message;
        notifyAll();
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        Message message = new Message();

        Runnable writerTask = () -> {
            String[] messages = { "Hello", "World", "Multithreading" };
            for (String msg : messages) {
                message.write(msg);
            }
        };

        Runnable readerTask = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Read: " + message.read());
            }
        };

        Thread writerThread = new Thread(writerTask);
        Thread readerThread = new Thread(readerTask);

        writerThread.start();
        readerThread.start();
    }
}