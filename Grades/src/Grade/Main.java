package Grade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"[English, ", "Chinese, ", "Math, ", "Science, ", "History]"};
        /*for(String subject: subjects) {
            System.out.print(subject);
        }*/
            Scanner input = new Scanner(System.in);
            System.out.println("Input grade score for English: ");
            int grade = input.nextInt();
    }
}
