package module2;

public class DaysInMonth {
    public static void main(String[] args){
        int mm = 2;
        System.out.println(daysInMonth(mm));
    }

    public static int daysInMonth(int m){
        int result;
        if(m == 2){
            result = 28;
        }else if(m < 8 ){
            result = (m%2 == 1)? 31: 30;
        }else {
            result = (m%2 == 1)? 30: 31;

        }
        return result;
    }
}
