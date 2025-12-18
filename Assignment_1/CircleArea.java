/*
Circle Area
Write a program to find the area of the circle.
Formula: area = pi*r*r
Consider pi = 3.142
Input Format:
First line contains an Integer, radius of a circle
Output Format:
Give the area of the circle.
The area of the circle should have four decimal places only.
Sample Input:
18
Sample Output:
1018.0080
 */
import java.util.*;
public class CircleArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pi = 3.142f;
        float radius = sc.nextFloat();
        float area = pi * radius * radius;
        System.out.printf("%.4f", area);
    }   
}
