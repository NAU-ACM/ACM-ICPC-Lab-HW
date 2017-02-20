import java.util.Scanner;

public class CountingSortTwo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] counter = new int[n];

        for(int i = 0; i < n; i++) {
            counter[in.nextInt()]++;
        }

        String output = "";
        for(int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                output += new String(new char[counter[i]]).replace("\0", i + " ");
            }
        }
        System.out.print(output);
    }
}