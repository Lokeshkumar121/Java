import java.util.Scanner;

public class Qestion1 {
    public static void main(String args[]){
        // Swaping of two numbers by using assignment operators by using third variable 
        int a , b , c;
        System.out.print("enter valu of a : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.print("enter valu of b : ");
        b = sc.nextInt();
        c = b;
        b = a;
        a = c;
        System.out.println("A value : " + a);
        System.out.println("B vlaue : " + b);
        }
}
