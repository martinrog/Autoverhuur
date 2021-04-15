package AutoVerhuur;

public class Klant {

    String naam;
    double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKortingsPercentage(double kP) {
        this.kortingsPercentage = kP;
    }

    public double getKortingsPercentage() {
        return kortingsPercentage;
    }
    public String toString() {
        return "Op naam : " + this.naam + "(Korting : " + this.kortingsPercentage + "%)";
    }

    public void setKorting(double kp) {
        this.kortingsPercentage = kp;

    }
}
