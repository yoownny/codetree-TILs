import java.util.*;

class Level {
    String id;
    int level;

    public Level(){
        this.id = "codetree";
        this.level = 10;
    }

    public Level(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();
        
        Level l1 = new Level();
        Level l2 = new Level(id, level);

        System.out.println("user " + l1.id + " lv " + l1.level);
        System.out.println("user " + l2.id + " lv " + l2.level);

    }
}