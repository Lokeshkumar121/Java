public class Question11 {
    public static void main(String[] args) {
        for(int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=4 ; j++){
                if ((i==1||i==4)||(j==1||j==4)) {
                    System.out.print("* \t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println(" ");
        }
        // System.out.println(" ");
    }
}
