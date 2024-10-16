import javax.sound.sampled.SourceDataLine;

public class Qestion3 {
    public static void main(String args[]){
        // find larget number between 3 
        int a = 10 , b = 20 , c = 30 ;
        // by using tarnary operator 
        String z = (a>b)?((a>c)?("a is greator "):("c is greator ")):((b>c)?(" b is greator "):("c is greator") );
        System.out.println(z);
    }
}
