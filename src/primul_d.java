/**
 * Created by genache on 10/30/2015.
 */
public class primul_d {
    public static void main(String[] abc) {
        int a=64321;
        int cifra = 0;
        int cifra1 = 0;
        int sum=0;
        int sum1=0;
        do {
            cifra = a % 10;
            sum=sum+cifra;
            a = a / 10;
        }while (a != 0);
        System.out.println("suma primilor digiti este : " + sum);
        do {
            cifra1 = sum % 10;
            sum1=sum1+cifra1;
            sum = sum / 10;
        }while (sum != 0);
        System.out.println("suma celorlalti digiti este : " + sum1);
    }
}
