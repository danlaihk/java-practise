package module2;

import java.util.HashMap;
import java.util.Scanner;

public class Color {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> cmap = new HashMap<>();
        String input, mapValue;
        String key;

        // G for Green, and R for Red.
        cmap.put("B","Blue");
        cmap.put("G","Green");
        cmap.put("R","Red");

        // cmap.put('B');
        System.out.print("What color do you want? ");


        input = sc.next();
        key = input.toUpperCase();

        //System.out.print(c);
        mapValue = cmap.get(key);

        if(mapValue != null){
            System.out.print("You have chosen "+cmap.get(key) +".");

        }else{
            //Unknown color: Bork
            System.out.print("Unknown color: " + input);

        }

    }
}
