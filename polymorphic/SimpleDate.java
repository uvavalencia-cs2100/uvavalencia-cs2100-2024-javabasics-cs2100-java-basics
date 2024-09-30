package polymorphic;


public class SimpleDate {

    public static final SimpleDate FINAL_EXAM = new SimpleDate(20241218);

    private int day;
    private int month;
    private int year;

    public SimpleDate() {}

    /*
    @param day The day of the date. Format YYYYMMDD
     */
    public SimpleDate(int fullDate) {
        String fullDateString = Integer.toString(fullDate);
        if (fullDateString.length() != 8) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.year = Integer.parseInt(fullDateString.substring(0, 4));
        this.month = Integer.parseInt(fullDateString.substring(4, 6));
        this.day = Integer.parseInt(fullDateString.substring(6, 8));
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
    public int amountOfDaysTo(SimpleDate otherDate) { 
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
        System.out.println("The difference in days between " + this + " and " + otherDate + " is " + days);
        return days;
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
        return String.format("Day: %d\nMonth: %d\nYear: %d", this.day, this.month, this.year);
    }

}