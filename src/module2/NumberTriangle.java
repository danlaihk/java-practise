package module2;

public class NumberTriangle {
    public static void main(String[] args){
        for(int row = 0; row < 7; row++){
            for(int col = 0; col < row+1; col++){
                System.out.print(row+1);
            }
            System.out.print("\n");
        }
    }
}
