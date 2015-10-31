/**
 * Created by genache on 10/30/2015.
 */
import java.util.Scanner;

public class problema8 {
    public static void main(String[] args) {
        int nr;
        do {
            Scanner in = new Scanner(System.in);
            nr = in.nextInt();
            if (nr >= 9 && nr <= 24) {
                System.out.println("true");
            } else {
                System.out.println("False");
            }

        }while (nr != 0);
    }
}
