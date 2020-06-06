package module1.ProjectTripPlanner;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TripPlanner {
    static final Scanner CONSOLE = new Scanner(System.in);
    static final double RATIO = 0.62137;

    private int days;
    private String currency;
    private float amount,rate ;

    public TripPlanner(String type){

    }

    public void init(){


        session();

    }
    private void session(){
        int hrDiff;
        double kmSq;
        greeting();
        System.out.println(
                "***********\n"
        );

        getDayAndCurr();


        printResult1();

        System.out.println(
                "***********\n"
        );


        System.out.print(
                "What is the time different , " +
                "in hours, between your home and your destination? "
        );

        hrDiff = CONSOLE.nextInt();

        printResult2(hrDiff);
        System.out.println(
                "***********\n"
        );

        System.out.print("What is the square area of your destination country in km2? ");
        kmSq = CONSOLE.nextDouble();

        printResult3(kmSq);
    }
    public float formatDec(double value, int digit){
        value = value* Math.pow(10, digit);
        value = Math.round(value);
        value /= Math.pow(10, digit);
        return  (float)value;
    }
    public void printResult3(double areaKm){
        double areaMile = areaKm *  formatDec(Math.pow(RATIO, 2), 4);


        System.out.println(
                "In miles2 that is "+ formatDec(areaMile,1)
        );
    }
    public void printResult2(int diff){
        System.out.println(
                "That means that when it is midnight at home it will be "
                        +getTime(diff, "00:00") +
                        " in your travel destination "
        );
        System.out.println(
                "and when it is noon at home it will be "+ getTime(diff, "12:00")

        );
    }
    public void printResult1(){


        System.out.println("If you are travelling for "+days+" days that is the same as "
                + calHour(days)+ " hours"+
                " or "
                +calMin(days)+
                " minutes ");


        System.out.println(
                "If you are going to spend $"
                        +amount+ " USD "+
                        "that means per day you can spend up to "
                        +"$"+ calAverSpend(days, amount)+ " USD"+
                        "");


        System.out.println(
                "Your total budget in "+ currency + " is "
                        + formatDec(calCur(amount, rate),2)  + " "+ currency+" ,"+
                        "which per day is about "
                        + formatDec(calAverSpend(days, calCur(amount, rate)),2)  +" "+currency
        );
    }
    public void greeting(){
        String name, destin;
        System.out.print(
                "What is your name? ");
        name = CONSOLE.nextLine();

        System.out.print(
                "Nice to meet you "+ name+", where are you travelling to? ");
        destin = CONSOLE.nextLine();

        System.out.println(
                "Great! "+destin+" sounds like a great trip");
    }
    public void getDayAndCurr(){

        System.out.print(
                "How many days are you going to spend travelling? ");
        days = CONSOLE.nextInt();


        System.out.print(
                "How much money, in USD, are you planning to spend on your trip? ");
        amount = CONSOLE.nextFloat();

        System.out.print(
                "What is the three letter currency symbol for your travel destination? ");
        currency = CONSOLE.next();

        System.out.print(
                "How many "+currency+" are there in 1 USD? ");
        rate = CONSOLE.nextFloat();
    }

    public String getTime(int diff, String timeStr){
        String[] tks = timeStr.split(":");
        int hr = (Integer.parseInt(tks[0]) + diff >= 24)?
                    Integer.parseInt(tks[0]) + diff - 24:
                    Integer.parseInt(tks[0]) + diff;


        return hr +":"+ tks[1];
    }
    private int calHour(int day){
        return day*24;
    }
    private int calMin(int day){
        return day*24*60;
    }
    private float calAverSpend(int day, float amount){
        return amount/day;
    }
    private float calCur(float amount, float rate){
        return amount*rate;
    }


}
