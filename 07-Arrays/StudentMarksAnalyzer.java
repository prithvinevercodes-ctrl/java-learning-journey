import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Marks Analyzer");

        int[] marks = new int[5];

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        int max = marks[0];
        int min = marks[0];

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

            if (marks[i] > max) {
                max = marks[i];
            }

            if (marks[i] < min) {
                min = marks[i];
            }
        }

        double average = (double) sum / marks.length;

        System.out.println("Total Marks = " + sum);
        System.out.println("Average Marks = " + average);
        System.out.println("Highest Marks = " + max);
        System.out.println("Lowest Marks = " + min);

        sc.close();
    }
          }
