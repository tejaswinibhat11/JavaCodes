import java.util.Scanner;

public class Fibonacci31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");
            // 1 2 3 5 8
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
