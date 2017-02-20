import java.util.Scanner;

public class CountingSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] counter = new int[n];

        for(int i = 0; i < n; i++) {
            counter[in.nextInt()]++;
        }

        for(int aCounter : counter) {
            if (aCounter > 0) {
                System.out.print(aCounter + " ");
            }
        }
    }
}