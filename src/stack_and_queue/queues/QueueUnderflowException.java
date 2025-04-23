package stack_and_queue.queues;

public class QueueUnderflowException extends Exception {
    public QueueUnderflowException() {
    }

    public QueueUnderflowException(String message) {
        super(message);
    }
}
