import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        String result = Integer.toString(c);
        char[] r = result.toCharArray();
        int cnt = 0;
        for(int i = 0 ; i < r.length ; i++ ){
            if(r[i]=='1')
                cnt++;
        }
        System.out.println(cnt);
    }
}