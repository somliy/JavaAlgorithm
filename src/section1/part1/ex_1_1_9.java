package section1.part1;

public class ex_1_1_9 {
    public static void main(String[] args) {
        int N = 45;
        System.out.println(Integer.toBinaryString(N));
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s += (n % 2);
        }
        System.out.println(s);
    }
}
