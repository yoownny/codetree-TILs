import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int lena = a.length();
        int lenb = b.length();
        int lenc = c.length();

        int min = 20;
        int max = 0;

        if(lena<min)
            min = lena;
        if(lenb<min)
            min = lenb;
        if (lenc<min)
            min = lenc;

        if(lena>max)
            max = lena;
        if (lenb>max)
            max = lenb;
        if (lenc>max)
            max = lenc;
            
        System.out.println(max-min);
    }
}