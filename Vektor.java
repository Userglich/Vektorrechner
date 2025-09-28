public class Vektor {
    double[] vektor = new double[3];

    //default Konstruktor
    public Vektor(){
    }

    public Vektor(double[] vektor){
        this.vektor = vektor;
    }

    //Prüfung der Kollinearität, mit Berücksichtigung von Division durch 0
    public boolean kollinear(double[] andererVektor){
        double[] r = new double[this.vektor.length];
        boolean kollinear = false;

        for (int i = 0; i<this.vektor.length; i++){
            if (andererVektor[i] == 0 && vektor[i] != 0){
                return kollinear;
            }
            if (andererVektor[i] == 0 && vektor[i] == 0){
                r[i]= 1;
            } else r[i] = vektor[i]/andererVektor[i];
        }
        if (r[0]==r[1] && r[0]==r[this.vektor.length-1]){
                kollinear = true;
        }
        return kollinear;
    }

    //Berechnung des Skalarproduktes zwischen zwei Vektoren
    public Double skalarprodukt(double[] andererVektor){
        double[] hilfsarray = new double[this.vektor.length];
        double result = -1;

        for (int i = 0; i<this.vektor.length; i++){
             hilfsarray[i] = this.vektor[i]*andererVektor[i];
        }

        if (this.vektor.length == 3){
            result = hilfsarray[0] + hilfsarray[1] + hilfsarray[2];
        } else {result = hilfsarray[0] + hilfsarray[1];}
        return (result);
    }
}