import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Enter any digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        while (n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;

        }

        System.out.println(ans);
    }
}
