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


