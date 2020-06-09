package module2;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){
        Scanner con = new Scanner(System.in);

        int integer;
        System.out.print("Type a number: ");
        integer = con.nextInt();

        if(integer%2 == 0){
            System.out.print("even");
        }else{
            System.out.print("odd");
        }
    }
}
