package stack_and_queue.stack_diff;

import stack_and_queue.StackOverflowException;
import stack_and_queue.StackUnderflowException;

public class Stack<T> {
    private static int MAX_SIZE = 1_000;
    private Object[] array;
    private int size ;
    private String name;

    public Stack() {
        //default constructor
        this(1_000);
    }

    public Stack(int maxSize) {
        MAX_SIZE = maxSize;
        this.array = new Object[MAX_SIZE];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public void push(T data) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is fulL!");
        }
        array[size++] = data;
//        array[size] = data;
//        size++;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty!");
        }
        return (T) array[size - 1];
    }

    public T pop() throws StackUnderflowException {
        T data = peek();
        array[--size] = null;
        return data;
    }

}















