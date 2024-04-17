/* Answers to questions

1. To be a date is to represent a day, a, month, and a year.
integers are best suited for represented a date.

2. A date is a description. A date can be changed, and it can be
printed. It shouldn't be hidden in code, rather the user should
always have access to you.
 */

public class Date {
    public int month;

    public int day;

    public int year;

    public void setDate(int month, int day, int year){
                        this.month = month;
                        this.day = day;
                        this.year = year;
    }

    public int getDay(){ return day; }

    public int getMonth(){ return month; }

    public int getYear(){ return year; }

    public String toString(){ return month + "/" + day + "/" + year; }
}


