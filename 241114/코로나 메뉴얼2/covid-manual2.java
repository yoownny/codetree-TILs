import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] evi = new char[3];
        int[] tem = new int[3];
        char[] result = new char[3];
        int[] cnt = new int[4];
        for(int i = 0 ; i < 3 ; i++){
            evi[i] = sc.next().charAt(0);
            tem[i] = sc.nextInt();

            if(evi[i]=='Y' && tem[i]>=37){
                result[i] = 'A';
                cnt[0]++;
            }
            else if(evi[i]=='N' && tem[i]>=37){
                result[i] = 'B';
                cnt[1]++;

            }
            else if(evi[i]=='Y'){
                result[i] = 'C';
                cnt[2]++;
            }
            else{
                result[i] = 'D';
                cnt[3]++;  
            }
        }

        for(int i = 0 ; i < 4 ; i++){
            System.out.print(cnt[i]+" ");
        }
        if(cnt[0]>=2)
            System.out.println('E');

    }
}