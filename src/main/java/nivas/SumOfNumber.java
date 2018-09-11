package nivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heymath on 20/7/18.
 */
public class SumOfNumber {

    public  static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter the sum:");
            int number = Integer.parseInt(br.readLine());
            int sum = 0;

            while(number != 0){
                sum = sum +(number % 10);
                number = number / 10;
            }

            System.out.println("Sum is:"+sum);

        }catch (IOException w){

        }
    }

}
