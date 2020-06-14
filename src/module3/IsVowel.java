package module3;

public class IsVowel {
    public static void main(String[] args){
        System.out.println(isVowel("A"));


    }
    static boolean isVowel(String str){
        String check = str.toLowerCase();

        if(check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u") ){
            return true;
        }else {
            return false;
        }
    }
}
