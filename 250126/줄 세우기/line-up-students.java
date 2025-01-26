import java.util.*;
class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student students){
        if(this.height == students.height){
            if(this.weight == students.weight){
                return this.num - students.num;
            }
            return students.weight - this.weight;
        }
        return students.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Student[] students = new Student[N];
        for(int i = 0 ; i < N ; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(height, weight, i+1);
        }
        Arrays.sort(students);
        for(int i = 0 ; i < N ; i++){
            System.out.println(students[i].height+" "+students[i].weight+" "+students[i].num);
        }
    }
}