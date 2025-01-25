import java.util.*;

class User implements Comparable<User>{
    String name;
    int height;
    int weight;

    public User (String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(User users){
        return this.height - users.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] users = new User[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            users[i] = new User(name, height, weight);
        }
        Arrays.sort(users);
        for(int i = 0; i < n; i++){
            System.out.println(users[i].name +" "+users[i].height+" "+users[i].weight);
        }
    }
}