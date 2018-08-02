package Grade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String[] subjects = {"[English, ", "Chinese, ", "Math, ", "Science, ", "History]"};
        for(String subject: subjects) {
            System.out.print(subject);
        }*/ //Can't get this to work

        System.out.println("English, Math, Chinese, Science, History.");
            Scanner input = new Scanner(System.in);
            System.out.println("Input grade score for English: ");
            int eng = input.nextInt();
            System.out.println("Input grade score for Maths: ");
            int math = input.nextInt();
            System.out.println("Input grade for Chinese: ");
            int chn = input.nextInt();
            System.out.println("Input grade for Science: ");
            int sci = input.nextInt();
            System.out.println("Input grade for History: ");
            int his = input.nextInt();

            if (eng < 50 ) {
                System.out.println("English: F");
            }
                else if (eng < 60 ) {
                    System.out.println("English: D.");
                }
                else if (eng < 70 ) {
                    System.out.println("English: C");
                }
                else if (eng < 80 ) {
                    System.out.println("English: B");
                        }
                else if (eng < 90 ) {
                    System.out.println("English: A");
                        }
                        else {
                System.out.println("Invalid score");
            }



    }
}
