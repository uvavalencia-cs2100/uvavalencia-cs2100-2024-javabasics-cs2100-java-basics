package interfaces;

/*
    This class represents a interface date with day, month and year for testing purposes of Interfaces. 
 */
public interface MyDate extends Comparable<MyDate> {

    public int getDay();
    public int getMonth();
    public int getYear();
    public void setDay(int day);
    public void setMonth(int month);
    public void setYear(int year);

    public default int compareTo (MyDate otherDate) {
        if (getYear() != otherDate.getYear()) {
            return getYear() - otherDate.getYear();
        } else if (getMonth() != otherDate.getMonth()) {
            return getMonth() - otherDate.getMonth();
        } else {
            return getDay() - otherDate.getDay();
        }
    }

}