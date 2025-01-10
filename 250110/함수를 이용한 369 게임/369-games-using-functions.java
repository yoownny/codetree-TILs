import java.util.Scanner;

public class Main {
    public static boolean isTree(int i){
        while(i > 0){
            if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
                return true;
            }
            i /= 10;
        }
        return false;
    }

    public static int isNum(int a, int b){
        int num = 0;
        for(int i = a; i <= b; i++){
            if(isTree(i) || i % 3 == 0){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = isNum(a, b);
        System.out.println(num);
    }
}