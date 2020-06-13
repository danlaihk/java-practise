package module2;

public class NestedNum {
    public static void main(String[] args){
        for(int row = 0; row < 3; row++){
            for(int col = 0; col <= 9 ; col++){
                for(int i = 0; i < 3; i++){
                    System.out.print(col);
                }
            }
            System.out.print("\n");
        }
    }
}
