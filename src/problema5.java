/**
 * Created by genache on 10/30/2015.
 */
import java.util.Scanner;
public class problema5 {
    public static void main(String[] args) {
        int[] a = {1,3,4,6,7,8,10,12,14,15,23,27,30};
        Scanner in = new Scanner(System.in);
        int numar = in.nextInt();
        int contor = 0;
        if (numar < a[0]) {
            System.out.println("Numarul " + numar + " nu este un element al sirului !");
        }

        else {
            for (int i = 0; i < a.length; i++) {
                if (numar == a[i]) {
                    System.out.println("Numarul " + numar + " se afla in sir pe pozitia " + (i+1));
                    break;
                } else {
                    if (numar < a[i]) {
                        System.out.println(" Numarul " + numar + " nu este un element al sirului");
                        contor = i;
                        break;
                    }
                }
            }
        }
        System.out.println("Procesul s-a incheiat la pozitia " + contor);

    }
}
