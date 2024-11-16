import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            int num = sc.nextInt();
            if(num==1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                char temp = ch[a-1];
                ch[a-1] = ch[b-1];
                ch[b-1] = temp;
                System.out.println(String.valueOf(ch)); 

            }else if (num==2){
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for(int j = 0 ; j < ch.length ; j++){
                    if(ch[j]==a){
                        ch[j] = b;
                    }
                }
                System.out.println(String.valueOf(ch));
            }
        }
    }
}