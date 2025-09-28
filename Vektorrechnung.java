import java.util.Scanner;
public class Vektorrechnung {
    public static void main(String[] args) {

        // Einlesen der vektorlaenge und Prüfung auf gültigen Wert
        Scanner scanner = new Scanner(System.in);
        boolean vektorlaengeGueltig = false;
        int vektorlaenge = 0;
        while (vektorlaengeGueltig == false) {
            System.out.println("Vektorlänge eingeben:");
            vektorlaenge = scanner.nextInt();
            if (vektorlaenge > 3 || vektorlaenge < 2) {
                System.out.println("ungültige Vektorlänge");
            } else vektorlaengeGueltig = true;
        }

        double[] v1 = new double[vektorlaenge];
        double[] v2 = new double[vektorlaenge];

        //Einlesen von Vektoren
        System.out.println("Ersten vektor eingeben:");
        for (int i = 0; i<vektorlaenge; i++){
            double v = scanner.nextDouble();
            v1[i] = v;
        }
        System.out.println("Zweiter vektor eingeben:");
        for (int i = 0; i<vektorlaenge; i++){
            double v = scanner.nextDouble();
            v2[i] = v;
        }

        //Eingabe der Rechenoperation
        System.out.println("Wähle eine option mit 1 oder 2");
        System.out.println("1. Skalarprodukt");
        System.out.println("2. Prüfung für Kollinearität");
        int rechenoperation = scanner.nextInt();

        // Ausführung der Rechenoperation und Ausgabe des Ergebnisses mithilfe der Klasse Vektoren
        Vektor V1 = new Vektor(v1);
        if (rechenoperation == 1) {
            System.out.println(V1.skalarprodukt(v2));
        }else if (rechenoperation == 2) {
            System.out.println(V1.kollinear(v2));
        } else {
            System.out.println("Keine gültige Auswahl");
        }
    }
}