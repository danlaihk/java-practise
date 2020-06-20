package module3;

import java.util.Scanner;

public class RepeatClass {
    public static void main(String[] args){
        String input;
        int rpt;
        Scanner con= new Scanner(System.in);
        do{
            System.out.print("Plz enter string: ");
            input = con.next();

            System.out.print("enter times: ");
            rpt = con.nextInt();

            System.out.println(repeat(input, rpt));

        }while ( rpt < 0);
    }
    public static String repeat(String input, int time) throws IllegalArgumentException
    {
        String output = "";
        if(time == 1){
            output = input;
        }else if(time > 0){
            time--;
            output = input + repeat(input, time);
        }else if(time < 0){
            throw new IllegalArgumentException();
        }
        return  output;
    }
}
