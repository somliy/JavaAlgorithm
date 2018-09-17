package section1.part3;


import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_38 {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        long startTime = System.currentTimeMillis();
        long endTime;
        int key = StdIn.readInt();
        if (BinarySearch.rank(key, whitelist) == -1) {
            StdOut.println(key);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Brute force search time: " + (endTime - startTime));

        key = StdIn.readInt();
        startTime = System.currentTimeMillis();
        Arrays.sort(whitelist);
        if (edu.princeton.cs.algs4.BinarySearch.indexOf(whitelist, key) == -1) {
            StdOut.println(key);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Binary search time: " + (endTime - startTime));
    }
}
