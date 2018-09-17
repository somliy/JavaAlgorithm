package section1.part2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ex_1_1_29 {
    public static void main(String[] args) {
        int[] whitelist = {7, 4, 6, 0, 0, 8, 6, 7, 3, 3};

        Arrays.sort(whitelist);

        String indices = "",
                values = "";
        for (int i = 0; i < whitelist.length; i++) {
            indices += String.format("%4d", i);
            values += String.format("%4d", whitelist[i]);
        }
        StdOut.println(indices + "\n" + values);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int r = rank(key, whitelist);
            int c = count(key, whitelist);
            StdOut.printf("(%d, %d) - %s\n", r, c, verify(r, c, key, whitelist));
        }
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, true);
    }

    public static int rank(int key, int[] a, boolean trace) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else {
                while (--mid >= 0 && a[mid] == key) ;
                return mid + 1;
            }
        }
        return 0;
    }

    public static int count(int key, int[] a) {
        int c = 0;
        for (int i = rank(key, a, false); i < a.length && a[i] == key; i++)
            c++;
        return c;
    }

    private static boolean verify(int r, int c, int key, int[] a) {
        for (int i = 0; i < a.length; i++)
            if ((i < r || i > r + c - 1) && a[i] == key ||
                    (i >= r && i <= r + c - 1) && a[i] != key)
                return false;
        return true;
    }
}
