package adts;

public class CacttusDate {
    private int day;
    private int month;
    private int year;

    public CacttusDate(int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //2000-01-30
    public CacttusDate(String date) {
        String[] parts = date.split("-");

        if (parts.length == 3) {
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int day = Integer.parseInt(parts[2]);
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid date format. Expected format: YYYY-MM-DD");
        }
    }

    public int month() {
        return month;
    }

    public int year() {
        return year;
    }

    public int day() {
        return day;
    }

    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}











