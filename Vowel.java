import java.util.Scanner;

public class Vowel {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aplphabet : ");
        char ch = sc.next().charAt(0);
        if (ch == 'a') {
            System.out.println("This charachter is vowel : ");            
        }
        else if (ch == 'e') {
            System.out.println("This charachter is vowel : ");            
        }
        else if (ch == 'i') {
            System.out.println("This charachter is vowel : ");            
        }
        else if (ch == 'o') {
            System.out.println("This charachter is vowel : ");            
        }
        else if (ch == 'u') {
            System.out.println("This charachter is vowel : ");            
        }
    else{
    
    System.out.println("Entered char is consonant " + ch);
}
    }
}