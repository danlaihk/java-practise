package module2;

public class ForToWhile {
    public static void main(String[] args){

        // a.
        System.out.println("a.");
        int max = 5;
        int n = 1;
        while (n <= max){
            System.out.println(n);
            n++;
        }
        System.out.println();

        System.out.println("b.");
        int total = 25, number = 1;
        while (number <= (total / 2)){
            total = total - number;
            System.out.println(total + " "+ number);
            number++;
        }
        System.out.println();

        // c.
        System.out.println("c.");
        int i , j, k;
        i = 1;
        while (i <= 2){
            j = 1;
            while (j <= 3){
                k =1;
                while (k <= 4){
                    System.out.print("*");
                    k++;
                }
                System.out.print("!");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();



        // d.
        System.out.println("d.");
        int number2 = 4;
        int count = 1;
        while (count <= number2){
            System.out.println(number2);
            number2 = number2/2;
            count++;
        }



    }
}
