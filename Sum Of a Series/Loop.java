import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                ans -= i;
            else
                ans += 1;
        }
        System.out.println(ans);
    }
}
