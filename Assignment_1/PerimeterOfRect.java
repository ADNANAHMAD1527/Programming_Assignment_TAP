/*
Perimeter Of a Rectangle
write a program to find the perimeter of the rectangle
Formula: area = length *width
Input Format:
First line contains an Integer, length of a rectangle
Second line contains an Integer, represents width of a rectangle
Output Format:
Gives perimeter of the rectangle
Sample Input:
2
4
Sample Output:
12
*/
import java.util.*;
class PerimeterOfRect {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int perimeter = 2 * (length+width);
        System.out.println(perimeter);
    }
}



