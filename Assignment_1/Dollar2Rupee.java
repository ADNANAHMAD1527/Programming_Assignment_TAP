/*
Convert Dollars to Rupees
Write a program to convert Dollars to rupees
Input Format:
First line contains single integer representing dollar
Output Format:
Print result after converting dollar to rupees
Sample Input:
1000
Sample Output:
61060.0
*/
import java.util.*;
public class Dollar2Rupee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();
        double rupees = dollar * 61.06;
        System.out.printf("%.1f",rupees);
    }
}
