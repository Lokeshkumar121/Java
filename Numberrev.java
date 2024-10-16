import java.util.Scanner;

public class Numberrev {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");                
        num=sc.nextInt();

        
        int rem=0;
        int rev = 0;
        for(int i = 1; num>0 ; i++){
          
            rem = num%10;
            rev=rev*10+rem;
             num = num/10;

        }
      
       
       
        System.out.print(rev); 
        if(num==rev){
            System.out.println("given number is plindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}
