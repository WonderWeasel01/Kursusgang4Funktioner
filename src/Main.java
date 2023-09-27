import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //opgave 1
        System.out.println("Opgave 1\n");
        opgave1("Hotdog");
        System.out.println("-----------------------------------------");


        //opgave 2
        System.out.println("Opgave 2\n");
        opgave2(20);
        System.out.println("-----------------------------------------");

        //opgave 3
        System.out.println("Opgave 3\n");
        opgave3("Jax", 10);
        System.out.println("-----------------------------------------");


        //opgave 4
        System.out.println("Opgave 4\n");
        double arealtrekant;
        arealtrekant = opgave4(12, 17);
        System.out.println("Arealet af trekanten = " + arealtrekant);
        System.out.println("-----------------------------------------");

        //Opgave 5
        System.out.println("Opgave 5\n");
        double længde = 22;
        double bredde = 44;
        double areal = opgave5(længde, bredde);
        System.out.println(længde + " og " + bredde + " = areal " + areal);

        System.out.println("-----------------------------------------");

        //Opgave 6
        System.out.println("Opgave 6\n");
        double omkreds = opgave6(længde, bredde);
        System.out.println(længde + " og " + bredde + " = omkredes " + omkreds);
        System.out.println("-----------------------------------------");


        //Opgave 7


        //Opgave 8
        System.out.println("Opgave 8\n");
        int a = 22;
        int b = 42;
        int min = opgave8(a, b);
        System.out.println(min);
        System.out.println("-----------------------------------------");


        //Opgave 9
        System.out.println("Opgave 9\n");
        int a2 = 12;
        int b2 = 32;
        int max = opgave9(a2, b2);
        System.out.println(max);
        System.out.println("-----------------------------------------");

        //Opagve 10
        System.out.println("Opgave 10\n");
        int tal1 = 12;
        int tal2 = 32;
        int tal3 = 50;
        int min2 = opgave10(tal1, tal2, tal3);
        System.out.println(min2);
        System.out.println("-----------------------------------------");

        //Opagve 11
        System.out.println("Opgave 11\n");
        int tal4 = 69;
        int tal5 = 90;
        int tal6 = 19;
        int max2 = opgave11(tal4, tal5, tal6);
        System.out.println(max2);
        System.out.println("-----------------------------------------");

        //Opagve 12
        System.out.println("Opgave 12\n");
        Scanner input = new Scanner(System.in);
        int år = input.nextInt();
        System.out.println(opgave12(år));

        System.out.println("-----------------------------------------");

        //Opgave 14
        Scanner in = new Scanner(System.in);
        System.out.println("Hvor meget vejer dit post");
        int weight = in.nextInt();
        System.out.println("----------------------");
        System.out.println("Hvor sendes din post til?");
        System.out.println("[1]Danmark\n[2]Udlandet, Færøerne og Grønland\n[3]Quickbreve");
        System.out.println("----------------------");
        int pris = in.nextInt();
        System.out.println(opgave14(pris,weight));
    }

    //Opgave 1
    public static void opgave1(String tekst) {
        for (int i = 0; i < 10; i++) {
            System.out.println(tekst);
        }

    }

    //Opgave 2
    public static void opgave2(int n) {
        for (int i = 0; i < n; i++)
            System.out.println(n);
    }

    //Opgave 3
    public static void opgave3(String navn, int n) {
        for (int i = 0; n > i; i++) {
            System.out.println(navn);

        }

    }

    //Opgave 4
    public static double opgave4(int højde, int grundlinje) {
        double arealtrekant = 0.5 * højde * grundlinje;
        return arealtrekant;


    }


    //Opgave 5
    public static double opgave5(double længde, double bredde) {

        double areal = længde * bredde;
        return areal;
    }

    //Opgave 6
    public static double opgave6(double længde, double bredde) {
        double omkreds = 2 * (længde + bredde);
        return omkreds;
    }


    //Opgave 7
    public static void opgave7() {

    }

    //Opgave 8
    public static int opgave8(int a, int b) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;

        }
        return min;


    }

    //Opgave 9
    public static int opgave9(int a2, int b2) {
        int max;

        if (a2 > b2) {
            max = a2;
        } else {
            max = b2;

        }
        return max;


    }

    //Opgave 10
    public static int opgave10(int tal1, int tal2, int tal3) {

        int min2;

        if (tal1 < tal2) {
            if (tal1 < tal3)
                min2 = tal1;
            else min2 = tal3;
        } else if (tal2 < tal1) {
            if (tal2 < tal3)
                min2 = tal2;
            else min2 = tal3;
        } else {
            min2 = tal3;
        }
        return min2;
    }

    //Opgave 11
    public static int opgave11(int tal4, int tal5, int tal6) {

        int max2;

        if (tal4 > tal5) {
            if (tal4 > tal6)
                max2 = tal4;
            else max2 = tal6;
        } else if (tal5 > tal4) {
            if (tal5 > tal6)
                max2 = tal5;
            else max2 = tal6;
        } else {
            max2 = tal6;
        }
        return max2;
    }

    //Opgave 12
    public static boolean opgave12 ( int år){
        if ((år % 4 == 0 && år % 100 != 0) || (år % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


    //opgave 14
    public static int opgave14(int pris, int weight) {

        if (pris == 1) {
            if (weight <= 50) {
                System.out.println("Det bliver 12kr");
            } else if (weight <= 100 && weight > 51) {
                System.out.println("Det bliver 24kr");
            } else if (weight <= 250 && weight > 101) {
                System.out.println("Det bliver 24kr");
            } else if (weight <= 2000 && weight > 251) {
                System.out.println("Det bliver 48kr");
            } else if (weight <= 2001) {
                System.out.println("Det bliver 60kr");
            }
        }
        if (pris == 2) {
            if (weight < 50) {
                System.out.println("Det bliver 36kr");
            } else if (weight <= 100 && weight > 51) {
                System.out.println("Det bliver 36kr");
            } else if (weight <= 250 && weight > 101) {
                System.out.println("Det bliver 72kr");
            } else if (weight <= 2000 && weight > 251) {
                System.out.println("Det bliver 96kr");
            } else if (weight <= 2001) {
                System.out.println("Det bliver 96kr");
            }
        }
        if (pris == 3) {
            if (weight < 100) {
                System.out.println("Det bliver 32kr");
            } else if (weight < 250 && weight > 101) {
                System.out.println("Det bliver 64kr");
            } else if (weight < 251) {
                System.out.println("Det bliver 96kr");
            }
        }
        return pris;
    }
}
