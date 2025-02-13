import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       LinkedList<Integer> list = new LinkedList<>();
       
       int N = sc.nextInt();
       for(int i = 0 ; i < N ; i++){
        String task = sc.next();

        if(task.equals("push_front")){
            int A = sc.nextInt();
            list.addFirst(A);
        } else if(task.equals("push_back")){
            int A = sc.nextInt();
            list.addLast(A);
        } else if(task.equals("pop_front")){
            System.out.println(list.pollFirst());
        } else if(task.equals("pop_back")){
            System.out.println(list.pollLast());
        } else if(task.equals("size")){
            System.out.println(list.size());
        } else if(task.equals("empty")){
            System.out.println(list.isEmpty()?1:0);
        } else if(task.equals("front")){
            System.out.println(list.peekFirst());
        } else if(task.equals("back")){
            System.out.println(list.peekLast());
        }

       }

    }
}