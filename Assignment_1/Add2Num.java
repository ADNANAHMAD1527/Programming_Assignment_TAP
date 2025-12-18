/*Adding Two Numbers
Write a program to add two integer numbers
Input Format:
First Line contain single num1 
Second line contain single num2
Output Format:
Print sum of both the integers num1 and num2
Sample Input:
5
10
Sample Output:
15 */
import java.util.*;
class Add2Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of number 1 & number 2 is: "+sum);
    }
}