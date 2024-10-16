import java.util.Scanner;

public class Nestedqestion {
    public static void main(){
        // WAP to find number is positive , negative and zero
        int num ;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num>0) {
            System.out.println("Number is positive");            
        }
        else{
            if (num<0) {
                System.out.println("NUmber is negtive");                
            }        
        else            
        {
            System.out.println("Number is zero");
        }
    }

    }
}
