package stack_and_queue;

public class StackUnderflowException extends Exception {
    public StackUnderflowException() {
    }

    public StackUnderflowException(String message) {
        super(message);
    }
}
