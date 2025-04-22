package stack_and_queue;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        try {
            stack.push(10);
            int nr1 = stack.pop();
            System.out.println("NR1 = " + nr1);
            int nr2 = stack.pop();
            System.out.println("NR2 = " + nr2);
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
