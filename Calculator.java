import java.util.Scanner;

public class Calculator {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        //

        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter value of a : ");
        a = sc.nextInt();

        System.out.print("enter operator : ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter value of b : ");
        b = sc.nextInt();

        if (operator == '+') {
            System.out.print(" a+b  is : " + (a + b));
        }
         else if (operator == '-') {
            System.out.print(" a-b is : " + (a - b));
        } 
        else if (operator == '*') {
            System.out.print(" a*b is : " + (a * b));
        } 
        else if (operator == '/') {
            System.out.print(" a/b is : " + (a / b));
        } 
        else if (operator == '%') {
            System.out.print(" a%b is : " + (a % b));
        } else {
            System.out.print(" invalid number enter char valid operator ");
        }
    }
}
