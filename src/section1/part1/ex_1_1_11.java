package section1.part1;

public class ex_1_1_11 {
    public static void main(String[] args) {
        for(int l = 0; l <= 5; l++){
            if(l != 0) System.out.print(l+" ");
            else System.out.print(" ");
        }
        System.out.print("\n");
        for(int i = 1; i <= 5; i++) {
            System.out.print(i+" ");
            for (int j = 1; j <= 5; j++) {
                boolean index = (Math.random() * 10 < 5);
                if (index) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
