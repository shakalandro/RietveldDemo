import java.util.GregorianCalendar;

/**
 * I store information (month, day) about a given date.
 */
public class Date implements Comparable<Date> {
    private int month;//stores calendar year
    private int day;//stores calendar day
    
    /**
     * Construct a Date for a given month/day
     */
    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }
    
    /**
     * @return this Date's month
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * @return this Date's day
     */
    public int getDay() {
        return day;
    }

    @Override
    public int compareTo( Date o ) {
        int d = month-o.month;
        if( d == 0 ) d = day-o.day;
        return d;
    }
    
    /**
     * Increment this date by 1 day.
     * @return the new date
     */
    public Date nextDate() {
        day++;
        
        int[] monthLengths = {31,28,31,30, 31,30,31,31,30,31,30,31};
        if(day > monthLengths[month]) {
          month++;
          day=1;
        }
        
        if(month > 12 ) {
            month = 1;
        }
        
        return this;
    }
    
    /**
     * @return true, iff this Date is a monday in the current year
     */
    public boolean is_monday() {
        return new GregorianCalendar(new GregorianCalendar().get(GregorianCalendar.YEAR),month,day).get(GregorianCalendar.DAY_OF_WEEK)==GregorianCalendar.MONDAY;
    }
}
