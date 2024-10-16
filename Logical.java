public class Logical {
    public static void main(String args[]){
        int a = 10 , b = 20;
        // logical and operator
        System.out.println((a>b)&&(a==b));
        System.out.println((a<b)||(a==b));
        System.out.println(!(a==b));
        // ternary operator
        String z = (a>b)?("A is greatar"):("b is grator");
        System.out.println(z);
    }    
}
