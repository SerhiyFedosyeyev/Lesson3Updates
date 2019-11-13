package Lesson3;
abstract class AbstractMonthClass {

public enum MonthEnum {
    JAN("jan", 1),
    FEB("Fed", 2),
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
    AbstractMonthClass(int numOfMonth){
        this.numOfMonth = numOfMonth;

     }
    public abstract void  printPhrase();
    public String returnNameByNum(int numOfMonth) {
        switch (numOfMonth) {
            case 1:
                return MonthEnum.JAN.monthValue;
            case 2:
                return MonthEnum.FEB.monthValue;
            case 3:
                return MonthEnum.MAR.monthValue;
            case 4:
                return MonthEnum.APR.monthValue;
            default:
                return null;
        }
    }





}
