import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] day = {31, 28, 31, 20, 31, 30, 31, 31, 30, 31, 30, 31};
        int num = 1;

        while(true){
            if(m2 == m1 && d2 == d1){
                break;
            }
            num++;
            d1++;
            if(day[m1-1]==d1){
                m1++;
                d1 = 0;
            }
        }

        System.out.println(num);
    }
}