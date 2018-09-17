package section1.part1;

import java.util.Scanner;

public class ex_1_1_22 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(rank(4, a, 0, 4, 0) + 1);
    }

    public static int rank(int key, int[] a, int lo, int hi, int step) {
        System.out.println("lo:" + lo + " hi:" + hi + " step:" + step);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid, step + 1);
        else if (key > a[mid]) return rank(key, a, mid, hi, step + 1);
        else return mid;
    }
}
