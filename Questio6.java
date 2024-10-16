import java.util.Scanner;
public class Questio6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char : ");
        char ch = sc.next().charAt(0);
        if ((ch>=48)&&(ch<=57))
        {
           System.out.println("yes it is digit");             
        }
        else
        {
            if ((ch>=65)&&(ch<=90)){
                System.out.println("It is upper case char");
            }
            else if ((ch>=97)&&(ch<=122)) {
                System.out.println("It is lower case char");                
            }
                else if( (ch>=32)&&(ch<=47)) {
                    System.out.println("these are special char");
                }
                else{
                    System.out.println("Not valid char ");
            }
        }
    }
    
}

