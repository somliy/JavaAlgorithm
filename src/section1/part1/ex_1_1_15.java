package section1.part1;

import java.util.Scanner;

public class ex_1_1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] b;
        b = histogram(arr, m);
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " " + b[i] + " ");
        }
    }

    public static int[] histogram(int[] arr, int m) {
        int[] a = new int[m + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) a[i]++;
            }
        }
        return a;
    }
}
