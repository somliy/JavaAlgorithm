package section1.part1;

public class ex_1_1_6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.print(f);
            f = f + g;
            g = f - g;
        }
        System.out.print("\n");
    }
}
