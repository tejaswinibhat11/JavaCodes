import java.util.Scanner;

public class Uppercount57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a[] = new String[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) >= 'A' &&
                    a[i].charAt(j) <= 'Z') {
                    count++;
                }
            }

            if (count > 2) {
                result++;
            }
        }

        if (result > 0)
            System.out.println(result);
        else
            System.out.println(-1);

        sc.close();
}
}
