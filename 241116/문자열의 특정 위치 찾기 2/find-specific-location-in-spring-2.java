import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = {"apple", "banana", "grape", "blueberry", "orange"};
        char c = sc.next().charAt(0);
        int cnt = 0;
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 2 ; j < 4 ; j++){
                if(c == input[i].charAt(j)){
                    System.out.println(input[i]);
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}