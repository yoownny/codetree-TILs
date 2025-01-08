public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            printStar();
        }
    }
    public static void printStar(){
        for (int i = 0; i < 10; i ++){
            System.out.print('*');
        }
        System.out.println();
    }
}