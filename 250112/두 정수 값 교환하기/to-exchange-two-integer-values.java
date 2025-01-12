import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

public class Main {
    public static void swap(IntWrapper n, IntWrapper m){
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper n = new IntWrapper(sc.nextInt());
        IntWrapper m = new IntWrapper(sc.nextInt());

        swap(n, m);

        System.out.println(n.value + " " + m.value);
    }
}