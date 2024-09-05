public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = a + b + c;
        a = b = c = d;
        System.out.printf("%d %d %d", a, b, c);
    }
}