package section1.part1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex_1_1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 10);
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");
        Arrays.sort(a);
        while (sc.hasNext()) {
            int key = sc.nextInt();
            int result = rank(key, a);
            if (result != -1) {
                System.out.println(key + " is in the array.");
            } else if (result == -1) {
                System.out.println(key + " is not in the array.");
            }
        }

    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid);
        else if (key > a[mid]) return rank(key, a, mid, hi);
        else return mid;
    }
}
