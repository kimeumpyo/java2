package exam02;

public class Schedule2 {
    private int year;

    private int month;

    private int day;

    public Schedule2() {
        // this.year = 2023;
        // this.month = 6;
        // this.day = 25;
        this(2023, 6, 25);
    }

    public Schedule2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int Year) {
        this.year = Year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void printThis() {
        System.out.println(this);
        // this.getYear();
        // getYear(); // this.생략가능
    }

    @Override
    public String toString() {
        return "{" +
                " year='" + getYear() + "'" +
                ", month='" + getMonth() + "'" +
                ", day='" + getDay() + "'" +
                "}";
    }
}
