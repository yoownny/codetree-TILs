import java.util.Scanner;

public class Main {
    public static int isTrue(String str, String point){
        int n = -1;
        int strNum = str.length();
        int pointNum = point.length();
        for(int i = 0 ; i <= strNum - pointNum ; i++){
            for(int j = 0 ; j < pointNum ; j++){
                if(str.charAt(i+j)!=point.charAt(j)){
                    break;
                }
                if(j == pointNum-1){
                    return i;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String point = sc.next();
        int result = isTrue(str, point);
        System.out.println(result);
    }
}