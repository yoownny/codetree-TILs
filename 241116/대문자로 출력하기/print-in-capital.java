import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strArray = str.toCharArray();
        for(int i = 0 ; i < strArray.length ; i++ ){
            if(strArray[i] >= 'A' && strArray[i] <= 'Z'){
                System.out.print(strArray[i]);
            }else if(strArray[i] >= 'a' && strArray[i] <= 'z'){
                System.out.print((char)(strArray[i] - 'a' + 'A'));
            }
        }
    }
}