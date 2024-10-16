import java.util.Scanner;

public class Inout {
    public static void main(String arg[]){
        int a , b;
        System.out.print("Enter a = ");
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        System.out.print("Enter b=");
        b=sc.nextInt();
        int  add = a+b;        
        System.out.println("Sum is : " + add);
        int sub = a-b;
        System.out.println("sub is : " + sub);
        int mul = a*b;
        System.out.println("mul is : " + mul);
        float div = a/b;
        System.out.println("div is : " + div);
        float mod = a%b;
        System.out.println("mod is : " + mod);
        // assignment operator 
        // = is working right to left 
    }    
}
