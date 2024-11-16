import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String[] input = new String[n];
        for(int i = 0 ; i < n ; i++ ){
            input[i] = sc.next();
        }
        int cnt = 0;
        for(int i = 0 ; i < n ; i++ ){
            if(input[i].compareTo(str)==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}