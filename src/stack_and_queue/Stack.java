package stack_and_queue;

//klase gjenerike per na mundesu me ruajt cfaredo tipi brenda saj sipas perdorshmerise
public class Stack<T> {
    private static int MAX_SIZE = 1_000;
    private Element<T> top;
    private int size;

    public Stack() {

    }

    public boolean isEmpty() {
        return size == 0; // return top == null;
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    //addFirst(data);
    public void push(T data) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stacku eshte full!");
        }
        Element<T> newElement = new Element<>(data, top);
        top = newElement;
        size++;
    }

    public T pop() throws StackUnderflowException {
//        if (isEmpty()) {
//            throw new StackUnderflowException("Stack is empty!");
//        }
//        T data = top.getData();
        T data = peek();
        top = top.getNext();
        size--;
        return data;
    }


    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty!");
        }
        return top.getData();
    }

}





