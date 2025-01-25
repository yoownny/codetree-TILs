import java.util.*;

class G007 {
    String secretCode;
    char meetingPoint;
    int time;
    
    public G007(String secretCode, char meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String secretCode = sc.next();
        char meetingPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        G007 g = new G007(secretCode, meetingPoint, time);

        System.out.println("secret code : " + g.secretCode);
        System.out.println("meeting point : " + g.meetingPoint);
        System.out.println("time : " + g.time);
    }
}