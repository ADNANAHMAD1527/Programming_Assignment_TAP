/*Adding Three Numbers
Write a program to add three integer numbers
Input Format:
First Line contain single integer m
Second line contain single integer n
Third line contain single integer k
Output Format:
Print sum of both the integers m, n and k
Sample Input:
5
10
5
Sample Output:
20
 */
import java.util.*;
public class Add3Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(m+n+k);
    }  
}
