/**
 * Created by genache on 10/30/2015.
 */
public class primul {
    public static void main(String[] abc) {
        int a = 64321;
        String b = Integer.toString(a);
        char[] carray = b.toCharArray();

        int suma = 0;
        for(int i =0; i < carray.length; i++) {
            suma = suma + Integer.parseInt(Character.toString(carray[i]));
        }
        System.out.println("Suma este : " + suma);


        int sum = 0;
        while (a !=0){
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println("suma digitilor este : " + sum);

        int numar=64321;
        int produs = 1;
        while (numar !=0){
            produs = produs * (numar % 10);
            /*System.out.println("Produsul este: " + produs);*/
            numar = numar / 10;
        }
        System.out.println("produsul digitilor este : " + produs);
        }
    }
