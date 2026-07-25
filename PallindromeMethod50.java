import java.util.Scanner;

public class PallindromeMethod50 {
    public static boolean palindrome(int num) {

        int original = num;
        int rev = 0;

        while (num != 0) {

            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (palindrome(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
