import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> q = new ArrayList<Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine()," ");
            String mission = st.nextToken();

            if(mission.equals("push")){
                int m = Integer.parseInt(st.nextToken());
                q.add(m);
            }else if(mission.equals("pop")){
                System.out.println(q.remove(0));
            }else if(mission.equals("size")){
                System.out.println(q.size());
            }else if(mission.equals("empty")){
                if(q.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(mission.equals("front")){
                System.out.println(q.get(0));
            }
        }
    }
}