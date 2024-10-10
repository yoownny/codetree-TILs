import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();  // Read the entire input line
        
        String[] numbers = input.split(" ");  // Split the string by spaces
        
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("0")) {  // Compare the string element with "0"
                max = i;  // Store the index of the first occurrence of "0"
                break;
            }
        }
        
        // Check if there are at least 3 numbers before the 0
        if (max >= 3) {
            int a1 = Integer.parseInt(numbers[max - 1]);
            int a2 = Integer.parseInt(numbers[max - 2]);
            int a3 = Integer.parseInt(numbers[max - 3]);
            
            int sum = a1 + a2 + a3;  // Sum the three numbers before the 0
            System.out.println(sum);
        } else {
            System.out.println("Not enough numbers before the 0.");
        }
    }
}