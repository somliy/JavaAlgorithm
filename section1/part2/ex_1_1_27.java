package section1.part2;

//参考//https://github.com/2BAB/Algorithms-Exercises/blob/master/1/1-1/Ex_1_1_27.java#L10
public class ex_1_1_27 {
    public static void main(String[] args) {

        int n = 10;
        int k = 5;
        double p = 0.5;

        System.out.print(binomial(n, k, p) + "  ");

        n = 100;
        k = 50;

        System.out.print(myBinomial(n, k, p) + "  ");
    }

    //书本案例
    public static double binomial(int n, int k, double p) {
        if (n == 0 && k == 0) {
            return 1.0;
        }
        if (n < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(n - 1, k, p) + p * binomial(n - 1, k - 1, p);
    }

    //参考实现
    public static double myBinomial(double[][] values, int n, int k, double p) {
        if (n == 0 && k == 0) {
            return 1.0;
        }
        if (n < 0 || k < 0) {
            return 0.0;
        }
        if (values[n][k] == -1) {
            values[n][k] = (1.0 - p) * myBinomial(values, n - 1, k, p) + p * myBinomial(values, n - 1, k - 1, p);
        }
        return values[n][k];
    }

    public static double myBinomial(int n, int k, double p) {
        double[][] values = new double[n + 1][k + 1];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= k; j++)
                values[i][j] = -1;

        return myBinomial(values, n, k, p);
    }
}
