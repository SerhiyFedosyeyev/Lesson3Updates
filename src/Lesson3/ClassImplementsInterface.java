package Lesson3;

import static Lesson3.DaysEnum.*;

public class ClassImplementsInterface implements PrintPhraseInterface {
    @Override
    public void printPhrase() {
        System.out.println("Some stupid message");

    }

    @Override
    public  String returnDayNameByNum (int dayNumber) {
        switch (dayNumber){
            case 1: return MONDAY.getDayValue();
            case 2: return TUESDAY.getDayValue();
            case 3: return WEDNESDAY.getDayValue();
            case 4: return THURSDAY.getDayValue();
            case 5: return FRIDAY.getDayValue();
            case 6: return SATURDAY.getDayValue();
            case 7: return SUNDAY.getDayValue();
            default: return null;
        }
    }

    @Override
    public int returnDayNumByName(String dayValue) {
        switch (dayValue){
            case "Monday": return MONDAY.getDayNumber();
            case "Tuesday": return TUESDAY.getDayNumber();
            case "Wednesday": return WEDNESDAY.getDayNumber();
            case "Thursday": return THURSDAY.getDayNumber();
            case "Friday": return FRIDAY.getDayNumber();
            case "Saturday": return SATURDAY.getDayNumber();
            case "Sunday": return SUNDAY.getDayNumber();
            default: return 0;
        }
    }
}
