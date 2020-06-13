package module2;

import java.util.Scanner;

public class LongestName {
    public static void main(String[] args){
        Scanner con = new Scanner(System.in);
        longname(con, 5);
    }
    private static void longname(Scanner con, int num){
        String name, longest = "";
        int isTie = 0;
        for(int i = 0; i < num; i++){
            System.out.print("name #"+(i+1)+"? ");

            name = con.next();

            if(name.length() > longest.length()){
                longest = name;
                isTie = 0;
            }else if( name.length() == longest.length()){
                isTie = 1;
            }
            longest = name.length() > longest.length()? name: longest;
        }
        longest = longest.substring(0,1).toUpperCase()+longest.substring(1).toLowerCase();
        System.out.println(longest+"'s name is longest");
        if(isTie == 1){
            System.out.println("(There was a tie!)");
        }
    }
}
