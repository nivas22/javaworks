package nivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heymath on 19/7/18.
 */
public class PushZero {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            //Get the array size
            int arraySize = Integer.parseInt(br.readLine());
            int[] values = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                //Get the total number of values to sum
                 values[i] = Integer.parseInt(br.readLine());
            }

            //Print the result
            for (int result : values) {
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Invalid number");
        } catch (IllegalArgumentException e) {
            System.err.println("No of given inputs are wrong..");
        }

    }
}
