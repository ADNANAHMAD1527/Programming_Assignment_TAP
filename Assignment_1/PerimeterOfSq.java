/*
Perimeter Of a Square
write a program to find the perimeter of the square
Formula: Perimeter = 4 * side
Input Format:
First line contains an Integer, side of a square
Output Format:
Gives perimeter of the square
Sample Input:
6
Sample Output:
24
 */
import java.util.*;
class PerimeterOfSq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int perimeter = a*4;
        System.out.println(perimeter);
    }
}