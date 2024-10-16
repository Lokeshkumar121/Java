import java.util.Scanner;

public class Question4 {
    public static void main(String args[]){
        int a;
        System.out.print("enter value of a = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        String z = (a%2==0)?("Number is even  "):("Number is odd  ");
        System.out.println(z);
    }
}
