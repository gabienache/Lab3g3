import java.util.Scanner;

/**
 * Created by genache on 10/30/2015.
 */
public class n_average_for {
    public static void main(String[] args0) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter N number of elements " +
                        "for finding average : ");

                final int elements = input.nextInt();;
                System.out.println("");

                double[] numbers = new double[elements];
                double sum = 0;


                for (int i = 0; i < elements; i++) {
                    System.out.print("Enter number "+(i+1)+" : " );
                    numbers[i] = input.nextDouble();
                    sum += numbers[i];
                }

                double average = sum / elements;

                System.out.println("");
                System.out.println("Average is " + average);

            }
        }