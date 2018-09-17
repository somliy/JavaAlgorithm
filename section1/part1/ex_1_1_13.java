package section1.part1;

public class ex_1_1_13 {
    public static void main(String[] args) {
        int[][] arr3 = new int[5][5];
        int kase = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr3[i][j] = ++kase;
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr3[j][i]);
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
}
