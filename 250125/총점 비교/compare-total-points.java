import java.util.*;
class User implements Comparable<User>{
    String name;
    int m1;
    int m2;
    int m3;

    public User (String name, int m1, int m2, int m3){
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    public int compareTo(User users){
        return (this.m1 + this.m2 + this.m3) - (users.m1 + users.m2 + users.m3);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] users = new User[n];
        for(int i = 0 ; i < n ; i++){
            String name = sc.next();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            users[i] = new User(name, m1, m2, m3);
        }
        Arrays.sort(users);
        for(int i = 0 ; i < n ; i++){
            System.out.println(users[i].name +" "+users[i].m1+" "+users[i].m2+" "+users[i].m3);
        }
    }
}