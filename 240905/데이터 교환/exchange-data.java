public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp;
        temp = c;
        c = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}