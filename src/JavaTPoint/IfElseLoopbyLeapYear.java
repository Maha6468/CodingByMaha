package JavaTPoint;

public class IfElseLoopbyLeapYear {
    public static void main(String[] args) {

                int year=2020;
                if(((year % 4 ==0) || (year%400==0)) && (year % 100 !=0)){   // if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))  atadileo hbe
                    System.out.println("LEAP YEAR");
                }
                else{
                    System.out.println("COMMON YEAR");
                }
    }
}
