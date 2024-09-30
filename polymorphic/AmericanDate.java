package polymorphic;

public class AmericanDate extends SimpleDate{

    public AmericanDate(int month, int day, int year) {
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
    }

    public AmericanDate(String month, String day, String year) {
        try {
            this.setMonth(Integer.parseInt(month));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid month");
        }
        try {
            this.setDay(Integer.parseInt(day));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid day");
        }
        try {
            this.setYear(Integer.parseInt(year));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid year");
        }
    }

    // mm/dd/yyyy
    public AmericanDate(String date) {
        String[] parts = date.split("/");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid date");
        }
        try {
            this.setMonth(Integer.parseInt(parts[0]));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid month");
        }
        try {
            this.setDay(Integer.parseInt(parts[1]));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid day");
        }
        try {
            this.setYear(Integer.parseInt(parts[2]));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid year");
        }
    }

    @Override
    public String toString() {
        return this.getMonth() + "/" + this.getDay() + "/" + this.getYear();
    }


}