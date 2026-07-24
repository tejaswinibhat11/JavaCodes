import java.util.Scanner;

public class PrintResume3 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String email = sc.nextLine();
        String skills = sc.nextLine();
        String education = sc.nextLine();
        String project = sc.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Skills : " + skills);
        System.out.println("Education : " + education);
        System.out.println("Project : " + project);
    }
}
