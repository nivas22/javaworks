package nivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heymath on 20/7/18.
 */

/*
         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
*/
public class Pyramid {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("Enter pattern type:");
            int patternType = Integer.parseInt(br.readLine());

            System.out.println("Enter array size:");
            int n = Integer.parseInt(br.readLine());

            if (patternType == 1) {
                showPattern1(n);
            }

            if (patternType == 2) {
                showPattern2(n);
            }


        } catch (IOException e) {

        }
    }

    private static void showPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println(" ");
        }
    }

    private static void showPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
