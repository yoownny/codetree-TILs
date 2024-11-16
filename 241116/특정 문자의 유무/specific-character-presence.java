import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int exist = 0;
        int exist2 = 0;
        for(int i = 0 ; i < input.length()-1 ; i++){
            if(input.charAt(i)=='e' && input.charAt(i+1)=='e'){
                exist = 1;
            }
        }
        for(int i = 0 ; i < input.length()-1 ; i++){
            if(input.charAt(i)=='a' && input.charAt(i+1)=='b'){
                exist2 = 1;
            }
        }
        if(exist == 1){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }
        if(exist2 == 1){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }
    }
}