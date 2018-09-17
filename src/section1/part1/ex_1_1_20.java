package section1.part1;

import java.util.Scanner;

public class ex_1_1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = solve(n);
        System.out.println(Math.log(x));

    }
    public static int solve(int x) {
        if(x == 1) return 1;
        return x*solve(x-1);
    }
}
