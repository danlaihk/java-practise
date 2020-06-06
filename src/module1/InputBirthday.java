package module1;

import java.util.Scanner;

public class InputBirthday {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        inputBirthday(input);
    }
    public static void inputBirthday(Scanner input){
        int dd , yy;
        String mm;

        System.out.print("On what day of the month were you born? ");
        dd = input.nextInt();

        System.out.print("What is the name of the month in which you were born? ");
        mm = input.next();

        System.out.print("During what year were you born? ");
        yy = input.nextInt();

        System.out.println("You were born on "+mm+" "+dd+", "+yy+". You're mighty old!");
    }
}
