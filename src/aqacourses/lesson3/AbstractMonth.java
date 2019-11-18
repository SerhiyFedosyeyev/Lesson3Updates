package aqacourses.lesson3;

abstract class AbstractMonth {

    public enum MonthEnum {
        JAN("jan", 1),
        FEB("Feb", 2),
        MAR("Mar", 3),
        APR("Apr", 4);


        private String monthValue;
        private int monthNumber;

        MonthEnum(String monthValue, int monthNumber) {
            this.monthValue = monthValue;
            this.monthNumber = monthNumber;
        }

        public String getMonthValue() {
            return monthValue;
        }

        public int getMonthNumber() {
            return monthNumber;
        }

    }


    private int numOfMonth;
    public String monthValue;

    /**
     * Constructor
     *
     * @param numOfMonth Month number
     */

    public AbstractMonth(int numOfMonth) {
        this.numOfMonth = numOfMonth;
        returnNameByNum(numOfMonth);

    }

    public abstract void printPhrase();

    /**
     * Returns month Value bu the numbet of the month
     *
     * @param numOfMonth Number of the month
     */
    public void returnNameByNum(int numOfMonth) {
        switch (numOfMonth) {
            case 1: System.out.println(MonthEnum.JAN.monthValue);
            case 2: System.out.println(MonthEnum.FEB.monthValue);
            case 3: System.out.println(MonthEnum.MAR.monthValue);
//                return MonthEnum.MAR.monthValue;
//            case 4:
//                return MonthEnum.APR.monthValue;
//            default:
//                return null;
        }
    }


}
