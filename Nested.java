public class Nested {
    public static void main(){
        int a = 10 , b = 20 , c = 30;
        if (a>b) {
            if (a>c) {
                System.out.println("a is greater ");
            }
            else{
                System.out.println("c is greter");
            }
        }
        else{
            if (b>c) {
                System.out.println("b is greter");
            }
            else{
                System.out.println("c is greter");
            }
        }
    }
}
