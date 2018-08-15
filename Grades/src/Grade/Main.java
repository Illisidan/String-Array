package Grade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"[English, ", "Chinese, ", "Math, ", "Science, ", "History]\n"};
        for(String subject: subjects) {
            System.out.print(subject);
        }
    int grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Input grade for English: \n");
        grade = input.nextInt();
        if (grade < 60 ) {
            System.out.print("D");
        }
    }
}
