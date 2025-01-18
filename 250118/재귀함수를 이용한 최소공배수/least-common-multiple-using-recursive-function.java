import java.util.Scanner;
public class Main {
    public static int isFind(int a, int b){
        int min, max;

        if(a < b){
            min = a;
            max = b;
        }else{
            min = b;
            max = a;
        }

        for(int i = 1 ; ; i++){
            int maxi = max * i;
            for(int j = 1 ; ; j++){
                int mini = min * j;
                if(maxi == mini){
                    return maxi;
                }else if(maxi < mini){
                    break;
                }
            }
        }

    }

    public static int isResult(int n, int[] num){
        if(n==0){
            return num[0];
        }
        return isFind(isResult(n-1, num), num[n]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n ; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(isResult(n-1, num));
    }
}