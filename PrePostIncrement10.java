import java.util.Scanner;

public class PrePostIncrement10 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Post Increment = " + (a++));
        System.out.println("After Post Increment = " + a);

        System.out.println("Pre Increment = " + (++a));
    }
}
