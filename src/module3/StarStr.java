package module3;

import java.util.Scanner;

public class StarStr {
    public static void main(String[] args){
        Scanner con = new Scanner(System.in);
            int num;

        do{
            System.out.print("enter num :");
            num =  con.nextInt();
            System.out.println(starString(num));
        }while (num >= 0);






    }

    public static String starString(int num) throws IllegalArgumentException{
        String output ;


            if(num == 0){
                output = "*";
            }else if(num < 0){
                throw new IllegalArgumentException();
            }else{

                output = starString(num - 1) + starString(num - 1);
            }

        return output;


    }


}
