import java.util.Random;
import java.util.Scanner;

public class Wuerfel2 {
    public static void main(String[] args) {
        System.out.println("Wieviele Wuerfel?");
        Scanner scan = new Scanner(System.in);
        int niedrig = scan.nextInt();
        int hoch = niedrig * 6;
        boolean treffer = false;
        System.out.print("Waehle eine Zahl zwischen " + niedrig);
        System.out.println(" und " + hoch);
        Scanner scan1 = new Scanner(System.in);
        Random random = new Random();
        int number = scan1.nextInt();
        int knapp = 0;
        int minus = -1;
        int ergebnis = 0;
        while (treffer == false) {
            for (int i = 1; i < niedrig + 1; i++) {
                int zufall = random.nextInt(6) + 1;
                ergebnis ++ zufall;
                System.out.print("-> " + zufall);
                System.out.println();
            }
            System.out.println("Deine Schaetzung war : " + number);
            System.out.println("Das Ergebnis ist " + ergebnis);
            if (number == ergebnis) {
                System.out.println("Treffer!");
                treffer = true;
            } else if (number != ergebnis) {
                if (number < ergebnis) {
                    knapp = number - ergebnis;
                    knapp = knapp * minus;
                    treffer = false;
                } else if (number > ergebnis) {
                    knapp = number - ergebnis;
                    treffer = false;
                }
                System.out.println("Du hast Verloren!");
                System.out.println("Du lagst daneben um: " + knapp);
                System.out.println("-------------------");
                System.out.println("-------------------");
            }

        }
    }
}
