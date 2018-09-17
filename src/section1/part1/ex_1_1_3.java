package section1.part1;

import java.util.Random;

public class ex_1_1_3 {
    public static void main(String[] args) {
        Random a81 = new Random(100);
        Random a82 = new Random(100);
        Random a83 = new Random(100);
        if (a81 == a82 && a82 == a83) System.out.println("squal");
        else System.out.println("now squal");
    }
}
