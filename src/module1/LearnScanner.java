package module1;

import java.util.Scanner;



public class LearnScanner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print(
                "Hi!\n"+
                "What is your name?"
        );
        String name = input.next();
        System.out.println("Hello " + name);

    }
}
