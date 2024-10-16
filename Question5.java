import java.util.Scanner;

public class Question5 {
    public static void main(String args[]) {
        System.out.print("Enter age : ");
        // intiliztion of container age 
        int age;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // to use for user input age 
        age = sc.nextInt();
        // to take condition if age is 18 =+ to eliglible for vote 
        if (age >= 18) 
        {
            System.out.println("Elegble for vote");
        } 
        else // age less than 18 to not eliglible for vote
        {
            System.out.println("Not Elegble for vote");
        }

    }
}
