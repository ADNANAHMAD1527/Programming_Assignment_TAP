/*
Farenheit to Celcius
Write a program to convert celsius to fahrenheit
Formula : Celsius = ((Fahrenheit-32)*5)/9;
Input Format:
First Line contain single integer m
Output Format:
Print the value after converting fahrenheit to celsius, the result should
restrict to 4 decimal places
Sample Input:
56
Sample Output:
13.0000
 */
import java.util.*;
public class Farenheit2Celcius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float fahrenheit = sc.nextFloat();
        float celsius = (fahrenheit-32)*(5.0f/9.0f);
        System.out.printf("%.4f", celsius);
    }
}
