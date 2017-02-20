import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSortThird {

    public static void main(String[] args) {
        try {
            String[] string;
            int[] count = new int[100];
            int sum = 0;

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bufferedReader.readLine());

            for(int i = 0; i < n; i++) {
                string = bufferedReader.readLine().split(" ");
                count[Integer.parseInt(string[0])]++;
            }

            for(int i = 0; i < 100; i++) {
                sum += count[i];
                System.out.print(sum + " ");
            }
        } catch (IOException e) {
        }
    }
}