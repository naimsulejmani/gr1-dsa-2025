package adts;
//https://notepad.pw/pinguinat
public class Date implements Comparable<Date> {
    private int day = 1;
    private int month = 1;
    private int year = 1970;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Date other) {
        //shkruaj logjiken qe e krahason objektin aktual me objektin o (other)
        // nese objekti aktual eshte me i madh kthe vlere pozitive
        // nese objekti aktual eshte me i vogel kthe vlere negative
        // perndryshe kthe 0 (barazim)

        //krahaso sipas vitit, nese viti eshte i njejte, krahaso sipas muajit, nese muaji eshte i njejte
        // krahaso sipas diteve

        if (this.year != other.year) {
            return other.year - this.year;
        } else {
            if (this.month != other.month) {
                return other.month - this.month;
            } else {
                return other.day - this.day;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);//YYYY-MM-DD ose //YYYYMMDD
    }
}










