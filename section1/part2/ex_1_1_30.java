package section1.part2;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class ex_1_1_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] a = new boolean[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (index(i, j)) a[i][j] = true;
                else a[i][j] = false;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    private static boolean index(int i, int j) {
        if (gcd(i, j) == 1) return true;
        return false;
    }

    private static int gcd(int i, int j) {
        if (j == 0) return i;
        return gcd(j, i % j);
    }
}
