import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = -1;

        String str = sc.next();
        char[] strArray = str.toCharArray();
        char c = sc.next().charAt(0);

        for(int i = 0 ; i < strArray.length ; i++){
            if(strArray[i] == c){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("No");
        }else{
            System.out.println(idx);
        }
        
    }
}