package module3;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Scanner;

public class Crypto {
    public static void main(String[] args){
        Scanner con = new Scanner(System.in);
        int key, size;
        String input;
        System.out.print("Enter text: ");
        input = con.nextLine();
        System.out.print("Enter key: ");
        key = con.nextInt();
        System.out.print("Group Size: ");
        size = con.nextInt();


        //String encrpyted = caesarify(normalizeText(input), key);

        //System.out.println(groupify(encrpyted, key) );
        String encryptTxt = encryptString(input, key, size);

        System.out.println("Encrypted Text: " + encryptTxt);

        System.out.println("Decrypted Text: "+decryptString(encryptTxt, key));

    }
    public static String decryptString(String encryptedTxt, int key){
        key = key * -1;
        String plainTxt;
        encryptedTxt = encryptedTxt.substring(0, encryptedTxt.length() - 1);
        encryptedTxt = encryptedTxt.replaceAll("\\s","");
        plainTxt = caesarify(encryptedTxt, key);
        return plainTxt;

    }
    public static String encryptString(String txt, int shift, int groupSize){
        String out, encrpyted;

        encrpyted = caesarify(normalizeText(txt), shift);

        return groupify(encrpyted, groupSize);
    }
    public static String normalizeText(String txt){
        String[] words;
        String output;
        txt = txt.replaceAll( "\\s", "");

        //2. Remove any punctuation (. , : ; ’ ” ! ? ( ) )
        //txt = txt.replaceAll("\\.","");
        output = txt.replaceAll("\\p{Punct}","").toUpperCase();


        return output;
    }

    public static String caesarify(String input, int shift){
        int charIndex;

        int start = 'A' ;
        int end = 'Z' ;
        String result = "";
        char currChar;


        for(int i = 0; i < input.length(); i++){


            charIndex = (int)input.charAt(i) + shift;

            //System.out.println(charIndex);
            if(charIndex > end){
                charIndex = start + (charIndex - end) -1;
                //System.out.println(charIndex +" = "+start+ " ("+charIndex+" - " +end +") - 1");
            }else if(charIndex < start){
                charIndex = end + (charIndex - start) + 1;
                //System.out.println(charIndex +" = "+end+ " ("+charIndex+" - " +start +") + 1");

            }


            currChar = (char) charIndex;
            //result = result + currChar+":"+charIndex+"\n";
            result = result.concat(String.valueOf(currChar));
        }

        return result;
    }
    public static String groupify(String input, int num){
        String output = "";
        for(int i = 0; i < input.length(); i += num){

                if(i + num < input.length() ){
                    output = output.concat(input.substring(i, i+ num)).concat(" ") ;
                }else {
                    output = output.concat(input.substring(i) ).concat("x");
                }


        }
        return output;
    }

}
