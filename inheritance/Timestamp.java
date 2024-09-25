package inheritance;
public class Timestamp extends SimpleDate {

    private int hour;
    private int minute;
    private int second;

    public Timestamp(int day, int month, int year, int hour, int minute, int second) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public Timestamp(SimpleDate date, int hour, int minute, int second) {
        this.setDay(date.getDay());
        this.setMonth(date.getMonth());
        this.setYear(date.getYear());
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }
    
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return this.getDay() + "/" + this.getMonth() + "/" + this.getYear() + " " + this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();
    }

    @Override
    public boolean equals(Object otherDateObject) {
        if (otherDateObject != null && otherDateObject instanceof Timestamp && super.equals(otherDateObject)) {
            Timestamp otherTimesamp = (Timestamp) otherDateObject;
            return this.hour == otherTimesamp.getHour() && this.minute == otherTimesamp.getMinute() && this.second == otherTimesamp.getSecond();
        } else{
            return false;
        }
    }
}
