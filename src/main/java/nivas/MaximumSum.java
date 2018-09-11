package nivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class MaximumSum {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //Get the array size
            int arraySize = Integer.parseInt(br.readLine());
            int[] results = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                //Get the total number of values to sum
                int spaces = Integer.parseInt(br.readLine());
                //Get the values to sum
                String line = br.readLine();
                String[] values = line.split("\\s+");

                Integer data[] = new Integer[spaces];
                if (spaces == values.length) {
                    for (int j = 0; j < spaces; j++) {
                        data[j] = Integer.parseInt(values[j]);
                    }

                    int maxVal = Collections.max(Arrays.asList(data));
                    results[i] = getMaximumSumResult(data, maxVal);
                } else {
                    //Throws an error if no of input mismatch
                    throw new IllegalArgumentException();
                }
            }

            //Print the result
            for (int result : results) {
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

    // Returns maximum sum in a subarray of size max value in array.
    private static int getMaximumSumResult(Integer values[], int maxValue) {
        if (values.length < maxValue) {
            System.out.println("Invalid");
            return -1;
        }
        int result = 0;
        for (int i = 0; i < maxValue; i++)
            result += values[i];

        int sum = result;
        for (int i = maxValue; i < values.length; i++) {
            sum += values[i] - values[i - maxValue];
            result = Math.max(result, sum);
        }
        return result;
    }
}
