package hash_tables;

import java.time.LocalDate;

public class TransactionDemo {
    public static void main(String[] args) {
        Transaction t1 = new Transaction("Barcelona", LocalDate.of(2010, 1, 1), 1000);
        Transaction t2 = new Transaction("Barcelona", LocalDate.of(2010, 1, 1), 1000);

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
