package section1.part2;


import static java.util.Collections.swap;

public class ex_1_1_26 {
    public static void main(String[] args) {
        int temp, a = 2, b = 1, c = 3;
        if(a > b) { temp = a;a = b;b = temp; }
        if(a > c) { temp = a;a = c;c = temp; }
        if(b > c) { temp = b;b = c;c = temp; }
        System.out.println(a+" "+b+" "+c);
    }
}
