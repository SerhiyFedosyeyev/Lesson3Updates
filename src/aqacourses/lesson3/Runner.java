package aqacourses.lesson3;

public class Runner {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        System.out.println(daysOfWeek.returnDayNameByNum(6));
        System.out.println(daysOfWeek.returnDayNumByName("Friday"));
        daysOfWeek.printPhrase();



        Month month = new Month(2);
        month.printPhrase();


    }
}
