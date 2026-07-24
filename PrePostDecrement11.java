import java.util.Scanner;

public class PrePostDecrement11 {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Post Decrement = " + (a--));
        System.out.println("After Post Decrement = " + a);

        System.out.println("Pre Decrement = " + (--a));
    }
}
