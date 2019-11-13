package Lesson3;

public class Runner {
    public static void main(String[] args) {
        ClassImplementsInterface dataToConsole = new ClassImplementsInterface();
        System.out.println(dataToConsole.returnDayNameByNum(6));
        System.out.println(dataToConsole.returnDayNumByName("Friday"));
        dataToConsole.printPhrase();


        int numOfMonth=5;
        ClassExtendsAbstract abs= new ClassExtendsAbstract(numOfMonth);
        abs.printPhrase();
        System.out.println(abs.returnNameByNum(1));
        abs.returnNameByNum(numOfMonth);
    }
}
