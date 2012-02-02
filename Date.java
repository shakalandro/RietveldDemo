/**
 * I store information (month, day) about a given date.
 */
public class Date {
    private int month;
    private int day;
    
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
}
