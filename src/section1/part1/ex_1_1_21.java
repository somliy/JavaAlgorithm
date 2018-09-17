package section1.part1;

import java.util.Scanner;

public class ex_1_1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        int[] a = new int[5];
        int[] b = new int[5];
        for (int i = 1; i <= 2; i++) {
            str[i] = sc.next();
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print(str[i] + " " + a[i] + " " + b[i] + " ");
            System.out.printf("%.3f",(double) (a[i] / b[i]));
        }
    }

}
