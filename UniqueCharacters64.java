import java.util.Scanner;

public class UniqueCharacters64 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    break;
                }
            }

            if (count > 0) {
                break;
            }
        }

        if (count == 0) {
            System.out.println("All characters are unique");
        } else {
            System.out.println("Characters are not unique");
        }
    }
}
