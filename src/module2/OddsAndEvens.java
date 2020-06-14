package module2;

import java.util.*;

public class OddsAndEvens {
    public static void main(String[] arg){
        Scanner con = new Scanner(System.in);

        Map<String, String> pInfo = start(con);
        Map<String, Integer> inputs =  play(con, pInfo.get("name"));
        printResult(inputs,pInfo);
    }
    private static void printResult(Map<String, Integer> input, Map<String, String> pInfo){
        int pFinger = input.get("player");
        int cFinger = input.get("computer");
        int sum = pFinger+cFinger;
        String pSide =  pInfo.get("side");
        pSide = pSide.substring(0, pSide.length()-1);

        String result = (sum % 2 == 0)? "even": "odd";

        System.out.println(pFinger + " + "+ cFinger +" = "+ sum);
        System.out.println(sum + " is ..." + result + "!");
        System.out.println("----------------------------------------------------");

        if(result.equals(pSide)){
            System.out.println("That means "+pInfo.get("name") +" wins! :)");
        }else{
            System.out.println("That means computer wins! :(");

        }


    }
    private static Map<String, Integer> play(Scanner con, String pSide){
        Random ran = new Random();
        int pFinger;
        Map<String, Integer> inputs = new HashMap<>();

        do {
            System.out.println("How many “fingers” do you put out?");
            pFinger = con.nextInt();
        }while(pFinger < 1 || pFinger > 5);


        int comFinger = ran.nextInt(6);
        System.out.println("The computer plays "+comFinger+" \"fingers\".");
        System.out.println("----------------------------------------------------");
        inputs.put("player", pFinger);
        inputs.put("computer", comFinger);

        return inputs;
    }
    private static Map<String, String> start(Scanner con){
        char input;
        String name,inStr = "", player = "", computer = "";
        Map<String, String> pInfo = new HashMap<>();

        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name? ");
        name = con.next();
        while (!inStr.equals("O") && !inStr.equals("E")){
            System.out.println("Hi "+name+", which do you choose? (O)dds or (E)vens?");
            input = con.next().charAt(0);
            inStr = String.valueOf(input);
        }

        if(inStr.equals("O")){
            player = "odds";
            computer = "evens";
        }else if(inStr.equals("E")){
            player = "evens";
            computer = "odds";
        }else{
            player = "";
            computer = "";
        }

        System.out.println(name+" has picked "+player+"! The computer will be "+computer+".\n");
        System.out.println("----------------------------------------------------");

        pInfo.put("name", name);
        pInfo.put("side", player);
        return pInfo;
    }

}
