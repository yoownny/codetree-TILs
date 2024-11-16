import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int idx = -1;

        for(int i = 0 ; i <= a.length()-b.length() ; i++){
            String str = a.substring(i, i + b.length());
            if(str.equals(b)){
                idx = i;
                break;
            }
        }

        System.out.println(idx);
    }
}