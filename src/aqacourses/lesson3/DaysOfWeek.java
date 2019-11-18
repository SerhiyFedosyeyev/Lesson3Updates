package aqacourses.lesson3;

public class DaysOfWeek implements DaysOfWeekInterface {
    @Override
    public void printPhrase() {
        System.out.println("Some stupid message");

    }

    /**
     * Implemented method
     *
     * @param dayNumber Day Number
     * @return Day Value
     */
    @Override
    public String returnDayNameByNum(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return DaysEnum.MONDAY.getDayValue();
            case 2:
                return DaysEnum.TUESDAY.getDayValue();
            case 3:
                return DaysEnum.WEDNESDAY.getDayValue();
            case 4:
                return DaysEnum.THURSDAY.getDayValue();
            case 5:
                return DaysEnum.FRIDAY.getDayValue();
            case 6:
                return DaysEnum.SATURDAY.getDayValue();
            case 7:
                return DaysEnum.SUNDAY.getDayValue();
            default:
                return null;
        }
    }

    /**
     * Returns Day Number by Day Value
     *
     * @param dayValue Day Value
     * @return Day Number
     */
    @Override
    public int returnDayNumByName(String dayValue) {
        switch (dayValue) {
            case "Monday":
                return DaysEnum.MONDAY.getDayNumber();
            case "Tuesday":
                return DaysEnum.TUESDAY.getDayNumber();
            case "Wednesday":
                return DaysEnum.WEDNESDAY.getDayNumber();
            case "Thursday":
                return DaysEnum.THURSDAY.getDayNumber();
            case "Friday":
                return DaysEnum.FRIDAY.getDayNumber();
            case "Saturday":
                return DaysEnum.SATURDAY.getDayNumber();
            case "Sunday":
                return DaysEnum.SUNDAY.getDayNumber();
            default:
                return 0;
        }
    }
}
