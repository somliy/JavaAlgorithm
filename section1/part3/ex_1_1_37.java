package section1.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex_1_1_37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ans = shuffleTest(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", ans[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] shuffleTest(int m, int n) {
        int[][] ans = new int[m + 1][m + 1];
        int num = 0;
        while (num < n) {
            List<Integer> li = new ArrayList<>(m + 1);
            n--;
            for (int i = 0; i < m; i++) {
                li.add(i, i + 1);
            }
            Collections.shuffle(li);
            for (int i = 0; i < m; i++) {
                ans[li.get(i)-1][i] ++;
            }
            num++;
        }
        return ans;
    }

}
