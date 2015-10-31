/**
 * Created by genache on 10/30/2015.
 */
import java.util.Scanner;
public class problema10 {
    public static void main(String[] args) {
        int a;
        do{
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            int i=0;
            int numar=1;
            if(a ==0 ){
                System.out.println("zero factorial =1");
            }
            else{
                for(i=1;i<=a;i++){
                    numar *=i;
                }
            }
            System.out.println("Factorialul lui "+a + " este "+numar);
        } while(a!=0);

    }
}
