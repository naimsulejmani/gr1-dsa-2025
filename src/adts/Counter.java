package adts;

public class Counter {
    private int value;
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    public void increment() {
        value++;
    }

    public int tally() {
        return value;
    }

    public String toString() {
        return name + ": " + value;
    }

}









