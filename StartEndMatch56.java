import java.util.Scanner;

public class StartEndMatch56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a[] = new String[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            if (a[i].charAt(0) == a[i].charAt(a[i].length() - 1)) {
                count++;
            }
        }

        if (count > 1)
            System.out.println(count * 2);
        else if (count == 1)
            System.out.println(-2);
        else
            System.out.println(-1);

        sc.close();
    }
}
