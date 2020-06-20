package module3;

import org.jetbrains.annotations.NotNull;

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

        System.out.println(encryptString(input, key, size));
    }
    public static String encryptString(String txt, int shift, int groupSize){
        String out, encrpyted;

        encrpyted = caesarify(normalizeText(txt), shift);

        return groupify(encrpyted, groupSize);
    }
    public static String normalizeText(String txt){
        String[] words;
        String output = "";
        txt = txt.replaceAll( "\\s", "");

        //2. Remove any punctuation (. , : ; ’ ” ! ? ( ) )
        //txt = txt.replaceAll("\\.","");
        output = txt.replaceAll("\\p{Punct}","").toUpperCase();


        return output;
    }

    public static String caesarify(@NotNull String input, int shift){
        int charIndex = 0;

        int start = (int)'A' ;
        int end = (int)'Z' ;
        String result = "";
        char currChar;


        for(int i = 0; i < input.length(); i++){


            charIndex = (int)input.charAt(i) + shift;

            if(charIndex > end){
                charIndex = start + (charIndex - end) -1;
            }else if(charIndex < start){
                charIndex = end - (charIndex - start) -1;
            }

            /*
            if (shift < 0) {
                charIndex = (int)input.charAt(i) + shift + 1;
            } else {
                charIndex = (int)input.charAt(i) + shift;
            }*/

            currChar = (char) charIndex;
            //result = result + currChar+":"+charIndex+"\n";
            result = result + currChar;
        }

        return result;
    }
    public static String groupify(String input, int num){
        String output = "";
        for(int i = 0; i < input.length(); i += num){

                if(i + num < input.length() ){
                    output = output + input.substring(i, i+ num)+" ";
                }else {
                    output = output + input.substring(i) + "x";
                }


        }
        return output;
    }

}
