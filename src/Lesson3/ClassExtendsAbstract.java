package Lesson3;

public class ClassExtendsAbstract extends AbstractMonthClass {


    ClassExtendsAbstract(int numOfMonth) {
        super(numOfMonth);
    }

    @Override
    public void printPhrase() {
        System.out.println("Hello)");

    }
}
