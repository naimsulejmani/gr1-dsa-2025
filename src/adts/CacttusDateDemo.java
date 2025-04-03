package adts;

public class CacttusDateDemo {
    public static void main(String[] args) {
        CacttusDate dt1 = new CacttusDate(12, 9, 2000);
        CacttusDate dt2 = new CacttusDate("2001-11-30");

        System.out.println(dt1.toString());
        System.out.println(dt2.month());

    }
}
