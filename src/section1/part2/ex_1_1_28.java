package section1.part2;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;

public class ex_1_1_28 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        Arrays.sort(a);
        int[] b = duplicateRemoval(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

    /**
     * 数组去重
     */
    private static int[] duplicateRemoval(int[] a) {
        //
        int num = count(a);
        int[] b = new int[a.length - num];
        int count = 0;
        b[0] = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            } else {
                b[i + 1 - count] = a[i + 1];
            }
        }
        return b;

    }

    /**
     * 计算重复数量
     */
    private static int count(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            }
        }
        return count;

    }

    public static int rank(int key, int[] a) {
        int l = 0, r = a.length - 1;
        while (r > l) {
            int mid = (l + r) / 2;
            if (key < a[mid]) l = mid;
            else if (key > a[mid]) r = mid;
            else return mid;
        }
        return -1;
    }
}
