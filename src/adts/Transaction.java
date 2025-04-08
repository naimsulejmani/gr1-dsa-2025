package adts;

public class Transaction implements Comparable<Transaction>{
    private String who;
    private Date when;
    private double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public Transaction(String transaction) {

    }

    public Date when() {
        return when;
    }

    public String who() {
        return who;
    }

    public double amount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%s; %s; %.2f", who, when, amount);
    }


    @Override
    public int compareTo(Transaction other) {
        if (Double.compare(this.amount, other.amount) != 0) {
            return Double.compare(this.amount, other.amount);
        } else if (this.when.compareTo(other.when) != 0) {
            return this.when.compareTo(other.when);
        } else {
            return this.who.compareTo(other.who);
        }
    }
}












