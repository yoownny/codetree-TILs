import java.util.*;

class Agent {
    char code;
    int num;

    public Agent (char code, int num){
        this.code = code;
        this.num = num;
    }

}

public class Main {

    public static void mini(Agent[] agent){
    char minCode = agent[0].code;
    int min = agent[0].num;
    for(int i = 1; i < 5 ; i++){
        if(min > agent[i].num){
            minCode = agent[i].code;
            min = agent[i].num;
        }
    }
    System.out.println(minCode +" " +min);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agent = new Agent[5];
        for(int i = 0 ; i < 5 ; i++){
            char code = sc.next().charAt(0);
            int num = sc.nextInt();
            agent[i] = new Agent(code, num);
        }
        mini(agent);
    }
}