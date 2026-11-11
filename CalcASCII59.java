import java.util.Scanner;

public class CalcASCII59 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum = sum + (int) str.charAt(i);
        }

        if (sum % 4 == 0 && sum % 5 == 0) {
            System.out.println(sum);
        } else {
            System.out.println("NA");
        }
    }
}
