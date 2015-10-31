import java.util.Scanner;

/**
 * Created by genache on 10/30/2015.
 */
import java.util.Scanner;
public class problema2si3 {

    public static void main(String[] args) {

            // write your code here
            Scanner in = new Scanner(System.in);
            int nr = in.nextInt();
            int invers = 0;
            int copieNr = nr;
            int ultimaCifra;
            while (nr >0) {
                ultimaCifra = nr % 10;
                invers = invers * 10 + ultimaCifra;
                nr = (nr - nr % 10) / 10;
            }
            System.out.println("Numarul invers este: " + invers);
            if (invers == copieNr) {
                System.out.println("Numarul este palindrom !");
            }
            else {
                System.out.println("Numarul nu este palindrom !");
            }

        }
    }

