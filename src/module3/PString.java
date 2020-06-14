package module3;

public class PString {
    public static void main(String[] args){
        printStrings("abc", 5);
    }
    static void printStrings(String str, int num){
        String output = "";
        for(int i = 0; i < num; i++){
            output = output.concat(str);
        }
        System.out.println(output);
    }
}
