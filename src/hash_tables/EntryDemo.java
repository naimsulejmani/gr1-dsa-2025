package hash_tables;

import java.time.LocalDate;

public class EntryDemo {
    public static void main(String[] args) {
        Entry<String, String> entry = new Entry<>("IP", "127.0.0.1");
        Entry<String, Integer> entry1 = new Entry<>("PORT", 8080);
        Entry<String, LocalDate> entry2 = new Entry<>("DATE", LocalDate.now());
        Entry<Integer, String> entry3 = new Entry<>(1, "REAL MADRID");

        System.out.println(entry);
        System.out.println(entry1);
    }
}
