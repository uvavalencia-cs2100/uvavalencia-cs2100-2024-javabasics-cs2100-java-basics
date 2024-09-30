package polymorphic;

public class SpanishDate extends SimpleDate{

    public SpanishDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    @Override
    public String toString() {
        return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
    }


}