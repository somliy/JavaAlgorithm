package section1.part3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class ex_1_1_35 {
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }
        System.out.print("Probability: ");
        for (int i = 2; i <= 2 * SIDES; i++) {
            dist[i] /= 36.0;
            System.out.printf("%6.3f", dist[i]);
        }
        System.out.println();
        int[] num = new int[2 * SIDES + 1];
        int n = StdIn.readInt();

        /**
         * 返回一个满足离散分布的int类型的数
         * @param a 算法产生随机数过程中需要使用此数组的数据，a[i]代表i出现的概率
         *      前提条件 a[i] 非负切和接近 1.0
         */
        for (int i = 0; i < n; i++) {
            num[StdRandom.discrete(dist)]++;
        }
        double frequecy;
        boolean isAccurate = true;
        System.out.print("Frequency: ");
        for (int i = 2; i <= 2 * SIDES; i++) {
            frequecy = (double) num[i] / n;
            System.out.printf("%6.3f", frequecy);
            if (Math.abs(frequecy - dist[i]) > 0.001) {
                isAccurate = false;
            }
        }
        System.out.println();
        System.out.println("IS accrate?" + isAccurate);
    }
}
