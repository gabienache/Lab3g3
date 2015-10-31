/**
 * Created by genache on 10/30/2015.
 */
import java.util.Scanner;
public class problema6   {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int nr = in.nextInt();
        if (nr == 0) {
            System.out.println("Numarul de numere este 0 deci nu avem ce aduna!!");
        }
        else {
            int suma = 0;
            int i;
            for (i = 1; i <= nr; i++) {
                suma = suma + i;
            }

            System.out.println("Suma primelor " + nr + " numere este: " + suma);
        }
    }
}
