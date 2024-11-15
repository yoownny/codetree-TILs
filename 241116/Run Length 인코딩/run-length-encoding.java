import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        int num = 1;
        char current = str.charAt(0);
        result += current;

        for(int i = 1 ; i < str.length() ; i++){
            if(current == str.charAt(i)){
                num++;
            }else{
                result += Integer.toString(num);
                num = 1;
                current = str.charAt(i);
                result += current;
            }
        }
        result += Integer.toString(num);

        System.out.println(result.length());
        System.out.println(result);
        
    }
}