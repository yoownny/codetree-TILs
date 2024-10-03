import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int lena = a.length();
        int lenb = b.length();
        if(lena > lenb){
            System.out.print(a + " " + lena);
        }
        else if (lena , lenb)
            System.out.print(b + " " + lenb);
        else
            System.out.print("same");
    }
}