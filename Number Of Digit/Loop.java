import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.print("Enter any digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigits = 0;
        int original_n = n;
        while (n > 0) {
            n = n / 10;
            numOfDigits++;
        }
        System.out.println("number of digit in " + original_n + " = " + numOfDigits);
    }
}