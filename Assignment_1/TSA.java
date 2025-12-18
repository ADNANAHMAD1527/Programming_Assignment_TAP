/*
Total Surface Area Of Cylinder
Write a program to calculate total surface area of a cylinder
Formula: 2 * pi* r*(r+h)
Input Format:
First line contains an Integer, radius of a cylinder
Second line contains an Integer, height of a cylinder
Output Format:
Give the area of the cylinder.
The area of the cylinder should have four decimal places only.
Sample Input:
7
13
Sample Output:
879.7600
*/
import java.util.*;
public class TSA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pi = 3.142f;
        float radius = sc.nextFloat();
        float height = sc.nextFloat();
        float totalSurfaceArea = 2 * pi * radius * (radius+height);
        System.out.printf("%.4f",totalSurfaceArea);
    }
}
