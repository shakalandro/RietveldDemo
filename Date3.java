/**
 * I store information (month, day) about a given date.
 * @version 1.1, 2010-02-04
 */
public class Date {
    private final int year;
    private Month month;
    private int day;
    
    /**
     * Construct a Date for a given month/day
     */
    public Date(int year, Month month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // get this Date's year
    public int year() {
        return year;
    }
    
    /**
     * @return this Date's month
     */
    public Month getMonth() {
        return month;
    }
    
    /**
     * @return this Date's day
     */
    public int getDay() {
        return day;
    }
    
    /**
     * Increment this date by 1 day.
     * @return the new date
     */
    public Date nextDate() {
        day++;
        
        if(day > month.days()) {
            month = month.next();
            day = 1;
        }
        
        return this;
    }
    
    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
        
        public int days(){
            if (this == SEPTEMBER || this == APRIL || this == JUNE || this == NOVEMBER) {
                return 30;
            } else if (this==FEBRUARY) {
                return 28;
            } else {
                return 31;
            }
        }
        
        public Month next(){
            return Month.values()[(this.ordinal() + 1)%12];
        }
    }
}
