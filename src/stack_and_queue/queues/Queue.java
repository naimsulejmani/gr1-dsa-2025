package stack_and_queue.queues;

public class Queue<T> {
    private static final int SPECIAL_EMPTY_VALUE = -1;
    private static int MAX_SIZE = 1_000;
    private Object[] array = new Object[MAX_SIZE];

    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public Queue() {
        //default constructor
    }

    public boolean isEmpty() {
        return headIndex == SPECIAL_EMPTY_VALUE;
    }

    public boolean isFull() {
        int newIndex = getNextIndex(tailIndex);
        return newIndex == headIndex;
    }

    private int getNextIndex(int index) {
        return (index + 1) % array.length;
    }

    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("Queue is full!");
        }
        tailIndex = getNextIndex(tailIndex);
        array[tailIndex] = data;

        if (headIndex == SPECIAL_EMPTY_VALUE) {
            headIndex = tailIndex;
        }
    }

    public T dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty!");
        }
        T data = (T) array[headIndex];
        //rasti kur e ka vetem 1 element ne queue
        if (headIndex == tailIndex) {
            headIndex = tailIndex = SPECIAL_EMPTY_VALUE;
        } else {
            headIndex = getNextIndex(headIndex);
        }
        return data;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (headIndex <= tailIndex) {
            return tailIndex - headIndex + 1;
        } else {
            return array.length - headIndex + tailIndex + 1;
        }
    }

}





