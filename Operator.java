import java.util.Scanner;

public class Operator {
    public static void main(String args[]){
        // unary operator 
        int a;
        System.out.println("Enter value of a ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("post increment "+ (++a));
        System.out.println("post decrement  "+ (--a));
        System.out.println("pre increment "+ (a++));
        System.out.println("pre decrement "+ (a--));
        System.out.println(a);
    }
}
