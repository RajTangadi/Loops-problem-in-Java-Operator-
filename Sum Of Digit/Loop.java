import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.print("Enter any digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigit = 0;
        int original_n = n;

        while (n > 0) {
            sumOfDigit += n % 10;
            n = n / 10;
        }
        System.out.println("sum of digits in " + original_n + " = " + sumOfDigit);
    }
}