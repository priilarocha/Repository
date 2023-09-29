package grade;

import java.util.Scanner;

/**
 * Demonstration of multiple if else if
 * User inputs a mark and a grade is displayed.
 * @author Paul Kelly
 *
 */
public class Grade {

    public static void main(String[] args) {
        int mark;
        char grade;

        // Enter a mark
        System.out.print("Enter a mark:");
        Scanner kb = new Scanner(System.in);
        mark = kb.nextInt();

        // Use the mark to get a grade
        if (mark >= 70) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("A mark of " + mark + " is a grade of " + grade);
    }

}
