import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int aa = (int)a;
        int bb = (int)b;
        if(aa > bb){
            System.out.println((aa+bb) +" " + (aa-bb));
        }else {
            System.out.println((aa+bb) +" " + (bb-aa));
        }
    }
}