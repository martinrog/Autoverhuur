package AutoVerhuur;

public class Auto {

    private String typeAuto;
    private double prijsPerDag;

    public Auto(String tp) {
        this.typeAuto = tp;
    }

    public Auto(String tp, double prPd) {
        this.typeAuto = tp;
        this.prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }
    public String toString() {
        return "autotype: " + this.typeAuto + "\n met prijs per dag : " + this.prijsPerDag;
    }
}
