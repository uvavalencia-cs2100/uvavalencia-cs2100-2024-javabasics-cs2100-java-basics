package comparable;

public class MonthComparator implements java.util.Comparator<SimpleDate> {

    @Override
    public int compare(SimpleDate date1, SimpleDate date2) {
        return date1.getMonth() - date2.getMonth();
    }
    
}
