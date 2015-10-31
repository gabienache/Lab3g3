/**
 * Created by genache on 10/30/2015.
 */
public class primul_c {
    public static void main(String[] abc) {
        int a = 15893467;
        int minim = Integer.MAX_VALUE;
        int maxim= Integer.MIN_VALUE;
        while (a>0){
            int digit = a % 10;
            maxim=Math.max(maxim,digit);
            minim=Math.min(minim, digit);
            a /=10;
        }
        System.out.println("maxim: " + maxim);
        System.out.println("minim: "+ minim);
    }
}
