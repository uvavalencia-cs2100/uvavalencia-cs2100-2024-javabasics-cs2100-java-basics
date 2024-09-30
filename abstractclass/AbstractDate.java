package abstractclass;

/*
    This class represents an example abstract date with day, month and year for testing purposes of Abstract classes. 
 */
public abstract class AbstractDate {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid day");
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (year < 2000 || year > 2024) {
            throw new IllegalArgumentException("Invalid year");
        }
        this.year = year;
    }

    /*
    @todo Does not implement leap years
    @todo Does not implement months with different amount of days
    */
    public int amountOfDaysTo(AbstractDate otherDate) { 
        int days = 0;
        if (this.compareTo(otherDate) > 0) {
            for (int i = otherDate.getYear(); i < this.year; i++) {
                days += 365;
            }
            for (int i = 1; i < this.month; i++) {
                days += 30;
            }
            days += this.day;
            for (int i = 1; i < otherDate.getMonth(); i++) {
                days -= 30;
            }
            days -= otherDate.getDay();
        } else {
            for (int i = this.year; i < otherDate.getYear(); i++) {
                days += 365;
            }
            for (int i = 1; i < otherDate.getMonth(); i++) {
                days += 30;
            }
            days += otherDate.getDay();
            for (int i = 1; i < this.month; i++) {
                days -= 30;
            }
            days -= this.day;
        }
        return days;
    }

    public int compareTo(AbstractDate otherDate) {
        if (this.year != otherDate.getYear()) {
            return this.year - otherDate.getYear();
        } else if (this.month != otherDate.getMonth()) {
            return this.month - otherDate.getMonth();
        } else {
            return this.day - otherDate.getDay();
        }
    }

    @Override
    public boolean equals(Object otherDateObject) {
        if (otherDateObject != null && otherDateObject instanceof AbstractDate) {
            AbstractDate otherDate = (AbstractDate) otherDateObject;
            return this.day == otherDate.getDay() && this.month == otherDate.getMonth() && this.year == otherDate.getYear();
        } else{
            return false;
        }
    }

    public abstract String toString();

}