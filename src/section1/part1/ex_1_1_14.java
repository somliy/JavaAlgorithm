package section1.part1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ex_1_1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(lg(x));
    }
    public static double lg(int n){
        return Math.log(n)/Math.log(2);
    }
}
