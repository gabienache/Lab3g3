/**
 * Created by genache on 10/24/2015.
 */
import java.util.Scanner;
public class two_numbers_average {
    public static void main(String[] abc) {
                int howMany = 0; // numarul de numere pentru care doresc media
                int sum = 0; // suma numerelor a caror medie se va calcula
                int nr; // depoziteaza numarul pe care il citesc de la tastatura
                float med; //media

                Scanner in = new Scanner(System.in); // functie pentru citirea de la tastatura

                do
                {
                    System.out.print("Numar: ");
                    nr = in.nextInt();

                    sum = sum + nr;
                    howMany++;
                }
                while(nr != -1);

                //afisare
                if(nr != -1 && howMany == 1)
                {
                    med = sum /  howMany;
                    System.out.println("Media este:" + med);
                }

                else
                {
                    System.out.println("Ati introdus direct -1.");
                }
            }
        }
