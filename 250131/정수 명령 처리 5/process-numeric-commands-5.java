import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for(int i =  0 ; i < N ; i++){
            String what = sc.next();
            if(what.equals("push_back")){
                int A = sc.nextInt();
                v.add(A);
            } else if (what.equals("pop_back")){
                v.remove(v.size()-1);
            } else if (what.equals("size")){
                System.out.println(v.size());
            } else if (what.equals("get")){
                int k = sc.nextInt();
                System.out.println(v.get(k-1));
            }
        }
    }
}