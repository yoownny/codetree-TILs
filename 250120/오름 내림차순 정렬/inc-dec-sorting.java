import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] num = new Integer[n];
        for(int i = 0 ; i < n ; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for(int i = 0 ; i < n ; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
        Arrays.sort(num, Collections.reverseOrder());
        for(int i = 0 ; i < n ; i++){
            System.out.print(num[i] + " ");
        }
    }
}