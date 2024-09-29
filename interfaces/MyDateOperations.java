package interfaces;

/*
    This class represents a interface date with day, month and year for testing purposes of Interfaces. 
 */
public interface MyDateOperations extends MyDate{

    public default int amountOfDaysTo(SimpleDate otherDate) {
        int days = 0;
        if (this.compareTo(otherDate) > 0) {
            for (int i = otherDate.getYear(); i < this.getYear(); i++) {
                days += 365;
            }
            for (int i = 1; i < this.getMonth(); i++) {
                days += 30;
            }
            days += this.getDay();
            for (int i = 1; i < otherDate.getMonth(); i++) {
                days -= 30;
            }
            days -= otherDate.getDay();
        } else {
            for (int i = this.getYear(); i < otherDate.getYear(); i++) {
                days += 365;
            }
            for (int i = 1; i < otherDate.getMonth(); i++) {
                days += 30;
            }
            days += otherDate.getDay();
            for (int i = 1; i < this.getMonth(); i++) {
                days -= 30;
            }
            days -= this.getDay();
        }
        return days;
}

    public default int compareTo (SimpleDate otherDate) {
        if (getYear() != otherDate.getYear()) {
            return getYear() - otherDate.getYear();
        } else if (getMonth() != otherDate.getMonth()) {
            return getMonth() - otherDate.getMonth();
        } else {
            return getDay() - otherDate.getDay();
        }
    }

}