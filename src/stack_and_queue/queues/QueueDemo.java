package stack_and_queue.queues;

public class QueueDemo {
    public static void main(String[] args) throws QueueOverflowException,
            QueueUnderflowException {
        Queue<String> listaEPritjes = new Queue<>();
        listaEPritjes.enqueue("Mirlindi");
        listaEPritjes.enqueue("Edona");
        listaEPritjes.enqueue("SpoDiKush");
        listaEPritjes.enqueue("Test");
        System.out.println(listaEPritjes.size());
        System.out.println(listaEPritjes.dequeue());
    }
}
