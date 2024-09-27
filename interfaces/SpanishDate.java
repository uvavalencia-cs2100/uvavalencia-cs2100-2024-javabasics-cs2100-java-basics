package interfaces;

public class SpanishDate extends SimpleDate {

    public SpanishDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    @Override
    public boolean equals(Object otherDateObject) {
        if (otherDateObject != null && otherDateObject instanceof SpanishDate) {
            SpanishDate otherDate = (SpanishDate) otherDateObject;
            return this.getDay() == otherDate.getDay() && this.getMonth() == otherDate.getMonth() && this.getYear() == otherDate.getYear();
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
    }

}