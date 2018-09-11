package nivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heymath on 20/7/18.
 */
public class SumPairArray {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the pairnumber:");
            int pairNumber = Integer.parseInt(br.readLine());

            System.out.println("Enter the array size:");
            int number = Integer.parseInt(br.readLine());

            int values[] = new int[number];
            System.out.println("Enter the array values:");
            for (int i = 0; i < number; i++) {
                values[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < number; i++) {
                for (int j = i+1; j < number; j++) {
                    int sum = values[i] + values[j];
                    if (sum == pairNumber) {
                        System.out.println("{" + values[i] + "," + values[j] + "}");
                    }
                }
            }

        } catch (IOException e) {

        }
    }
}
