import java.util.*;
public class Qestio7 {

    public static void main(String args[]){
        // print tabel number 
        int i;
        int num;
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which tabel you want : ");
        num = sc.nextInt();
        for(i=1; i<=10;i++){
            int table = num*i;
            System.out.println(num + "*" + i + " = " + table);
        }

    }
}
