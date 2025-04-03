package adts;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter("RONALDO");
        Counter counter2 = new Counter("MESSI");


        counter.increment();
        counter2.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.tally());
        System.out.println(counter.toString());
        System.out.println(counter2.toString());
    }
}
