package aqacourses.lesson3;

public class Month extends AbstractMonth {

    /**
     * Constructor
     *
     * @param numOfMonth Month number
     */
    public Month(int numOfMonth) {
        super(numOfMonth);
    }

    /**
     * Print some message method
     */
    @Override
    public void printPhrase() {
        System.out.println("Hello)");

    }
}
