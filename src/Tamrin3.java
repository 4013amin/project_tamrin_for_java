import java.util.Scanner;

public class Tamrin3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] d = new long[t];

        for (int i = 0; i < t; i++) {
            d[i] = scanner.nextLong();
        }

        scanner.close();

        for (int i = 0; i < t; i++) {
            System.out.println(calculatePoints(d[i]));
        }
    }

    private static long calculatePoints(long d) {
        // Count of points where police can catch the thief
        // If d is 2 or less, there's only one possible point (d, 0)
        if (d <= 2) {
            return 1;
        }

        // For larger values of d
        long points = 0;
        for (long x = -d; x <= d; x++) {
            for (long y = -d; y <= d; y++) {
                if (Math.abs(x) + Math.abs(y) == d) {
                    points++;
                }
            }
        }
        return points;
    }
}
