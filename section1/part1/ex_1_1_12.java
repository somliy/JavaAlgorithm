package section1.part1;

public class ex_1_1_12 {
    public static void main(String[] args) {
        int[] arr2 = new int[10];
        for(int i = 0; i < 10; i++)
            arr2[i] = 9 - i;
        for(int i = 0; i < 10; i++)
            arr2[i] = arr2[arr2[i]];
        for(int i = 0; i < 10; i++)
            System.out.println(arr2[i]);
    }
}
