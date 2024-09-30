package comparable;

public class SimpleDate implements Comparable<SimpleDate> {

    public static final SimpleDate FINAL_EXAM = new SimpleDate(18, 12, 2024);

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
  
    public int compareTo(SimpleDate otherDate) {
        if (this.year != otherDate.getYear()) {
            return this.year - otherDate.getYear();
        } else if (this.month != otherDate.getMonth()) {
            return this.month - otherDate.getMonth();
        } else {
            return this.day - otherDate.getDay();
        }
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", this.day, this.month, this.year);
    }

}