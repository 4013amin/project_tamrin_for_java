import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tamrin2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n < 1 || n > 99) {
            System.out.println("-1");
            return;
        }

        int[] a = new int[6];
        int[] b = new int[6];
        Set<Integer> digitsNeeded = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                digitsNeeded.add(i);
            } else {
                digitsNeeded.add(i / 10);
                digitsNeeded.add(i % 10);
            }
        }

        if (digitsNeeded.size() > 12) {
            System.out.println("-1");
            return;
        }

        int indexA = 0, indexB = 0;
        for (int digit : digitsNeeded) {
            if (indexA < 6) {
                a[indexA++] = digit;
            } else if (indexB < 6) {
                b[indexB++] = digit;
            }
        }

        while (indexA < 6) {
            a[indexA++] = 0;
        }
        while (indexB < 6) {
            b[indexB++] = 0;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
