import java.util.Scanner;

class StrongNumber {
    // Function to calculate the factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num = s.nextInt();
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10; // Extract the last digit
            sum += factorial(digit); // Add the factorial of the digit to the sum
            temp /= 10; // Remove the last digit
        }

        if (sum == num)
            System.out.println(num + " is a Strong Number.");
        else
            System.out.println(num + " is not a Strong Number.");          
      s.close();
    }
}
