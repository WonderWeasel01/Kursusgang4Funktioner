public class FunktionerIBog {
    public static void main(String[] args) {
        int n = 1;


        for (int i=0; i < 100; i++, n++) {

            System.out.println(Opgave6_1(n));
        }
    }


    //Opgave 6.1
    public static int Opgave6_1(int n) {


        int pentagolan = n * (3 * n - 1) / 2;

        return pentagolan;
    }
}
