/**
 * Created by genache on 10/30/2015.
 */
import java.util.Scanner;
public class problema9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int puterea = 1;
        if (a == 0 && b == 0) {
            System.out.println("Caz de nedeterminare !!!");
        }
        else {

            for (int i = 0; i < b; i++) {
                puterea = puterea * a;
            }
            System.out.println(a + " la puterea " + b + " = " + puterea);
        }
    }
}