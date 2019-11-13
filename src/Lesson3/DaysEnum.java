package Lesson3;

public enum DaysEnum
{
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7);

    private String dayValue;
    private int dayNumber;
/**
 * return Day Value
 */

    public String getDayValue() {
        return dayValue;
    }
/**
 * return day number
 */

    public int getDayNumber() {
        return dayNumber;
    }
/**
 * DaysEnum Constructor
 */

    DaysEnum(String dayValue, int dayNumber) {
        this.dayValue = dayValue;
        this.dayNumber = dayNumber;
    }
}

