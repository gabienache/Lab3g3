import java.util.Scanner;

/**
 * Created by genache on 10/24/2015.
 */
public class n_numbers_average {
    public static void main(String[] args0)
    {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double average = 0.0;
        int count = 0;
        String exit = "";

        System.out.println("Introduceti numerele : ");
        while(scanner.hasNext()){
            if(scanner.hasNextDouble()) {
                sum = sum + scanner.nextDouble();
                count++;
            }
            else
                exit = scanner.next();

                if(exit.equals("exit")) {
                    break;
                }
                else {
                    System.out.println("Program not exited... ");
                }
        }
        average = sum / count;
        System.out.println("Media este : " + average);

    }
}
