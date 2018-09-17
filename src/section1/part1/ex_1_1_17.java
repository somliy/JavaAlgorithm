package section1.part1;

public class ex_1_1_17 {
    /*
    * 死循环
    *if语句(n <= 0)不会运行
    * */
    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }
}
