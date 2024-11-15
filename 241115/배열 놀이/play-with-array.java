import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0 ; i < n ; i++){
            input[i] = sc.nextInt();
        }
        for(int j = 0 ; j < q ; j++){
            int num = sc.nextInt();
            if(num==1){
                int a = sc.nextInt();
                System.out.println(input[--a]);

            }else if (num==2){
                int index = 0;
                int b = sc.nextInt();
                for(int i = 0 ; i < n ; i++){
                    if(input[i] == b){
                        index =i;
                        break;
                    }
                }
                System.out.println(++index);

            }else if (num==3){
                int s = sc.nextInt();
                int e = sc.nextInt();
                s--;
                e--;
                for(int i = s ; i <= e ; i++){
                    System.out.print(input[i] + " ");
                }
            }
        }
    }
}