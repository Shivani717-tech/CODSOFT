import java.util.*;

public class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Subject marks input
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        
        int[] marks = new int[n];
        int total = 0;
        
        for(int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Average percentage
        double average = (double) total / n;

        // Grade calculation
        char grade;
        if(average >= 90)
            grade = 'A';
        else if(average >= 80)
            grade = 'B';
        else if(average >= 70)
            grade = 'C';
        else if(average >= 60)
            grade = 'D';
        else
            grade = 'F';

        // Display result
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);
    }
}
