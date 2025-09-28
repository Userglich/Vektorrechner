import java.util.Scanner;
public class Vektorrechnung {
    public static void main(String[] args) {

        // Einlesen der Vektorgröße und Prüfung auf gültigen Wert
        Scanner scanner = new Scanner(System.in);
        boolean vektorgrößeGültig = false;
        int vektorgröße = 0;
        while (vektorgrößeGültig == false) {
            System.out.println("Vektorgröße eingeben (2 oder 3):");
            vektorgröße = scanner.nextInt();
            if (vektorgröße > 3 || vektorgröße < 2) {
                System.out.println("ungültige Vektorgröße");
            } else vektorgrößeGültig = true;
        }

        double[] v1 = new double[vektorgröße];
        double[] v2 = new double[vektorgröße];

        //Einlesen von Vektoren
        System.out.println("Ersten vektor eingeben:");
        for (int i = 0; i<vektorgröße; i++){
            double v = scanner.nextDouble();
            v1[i] = v;
        }
        System.out.println("Zweiter vektor eingeben:");
        for (int i = 0; i<vektorgröße; i++){
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
