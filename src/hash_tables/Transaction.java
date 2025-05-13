package hash_tables;

import java.time.LocalDate;

public class Transaction implements Comparable<Transaction> {
    private String who;
    private LocalDate when;
    private double amount;

    public Transaction(String who, LocalDate when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Transaction other) {
        if (Double.compare(this.amount, other.amount) != 0) {
            return Double.compare(this.amount, other.amount);
        } else {
            if (this.when.compareTo(other.when) != 0) {
                return this.when.compareTo(other.when);
            } else {
                return this.who.compareTo(other.who);
            }
        }
    }


    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (who != null ? who.hashCode() : 0);
        hash = 31 * hash + (when != null ? when.hashCode() : 0);
        hash = 31 * hash + Double.hashCode(amount);
        return hash;
    }
}













