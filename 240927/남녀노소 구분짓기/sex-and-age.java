import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt();
        int age = sc.nextInt();
        if(sex == 0){
            if(age<19)
                System.out.println("BOY");
            else
                System.out.println("MAN");
        }
        else if(sex == 1){
            if(age<19)
                System.out.println("GIRL");
            else
                System.out.println("WOMAN");
        }
    }
}