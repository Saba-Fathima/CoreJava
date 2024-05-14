import java.util.Scanner;

class Studentresult {
public static void main(String[] args) {
        // Scanner object creation
        Scanner s = new Scanner(System.in);

        // Read the data from the command prompt
        System.out.println("Enter Student name...");
        String studentName = s.next();

        System.out.println("Enter Student rollNo...");
        int studentRollNo = s.nextInt();

        System.out.println("Enter Student science marks...");
        int science = s.nextInt();

        System.out.println("Enter Student social marks...");
        int social = s.nextInt();

        System.out.println("Enter Student math marks...");
        int math = s.nextInt();

        int total;
        total = science + social + math;

        double average;
        average = total / 3.0; 

        System.out.println("Student Name: " + studentName);
        System.out.println("Student RollNo: " + studentRollNo);
        System.out.println("Student Total Marks: " + total);

        if (average >= 50) {
            System.out.println("Congratulations! You passed with an average of " + average);
        } else {
            System.out.println("Sorry! You failed with an average of " + average);
        }

        // Close the Scanner
        s.close();
    }
}
