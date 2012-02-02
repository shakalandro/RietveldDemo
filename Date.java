/**
 * This class stores a Date in time with months and days.
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
