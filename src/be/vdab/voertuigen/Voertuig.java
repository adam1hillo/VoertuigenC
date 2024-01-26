package be.vdab.voertuigen;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;

import java.util.Objects;

public abstract class Voertuig implements Privaat, Milieu, Comparable<Voertuig> {

    private String polishouder = "onbepaald";
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat = "onbepaald";

    public Voertuig() {

    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }

    public abstract double getKyotoScore();
    public String getPolishouder() {
        return polishouder;
    }

    public final void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isBlank()) {
            this.polishouder = polishouder;
        }
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public final void setKostprijs(float kostprijs) {
        if (kostprijs > 0.0F) {
            this.kostprijs = kostprijs;
        }
    }

    public int getPk() {
        return pk;
    }

    public final void setPk(int pk) {
        if (pk > 0) {
            this.pk = pk;
        }
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public final void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0.0F) {
            this.gemVerbruik = gemVerbruik;
        }
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public final void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isBlank()) {
            this.nummerplaat = nummerplaat;
        }
    }

    @Override
    public String toString() {
        return polishouder + "; " + kostprijs + "; " + pk + "; " + gemVerbruik + "; " + nummerplaat;
    }
    public void toon() {
        System.out.println("Polishouder: " + polishouder +
                "\nKostprijs: " + kostprijs +
                "\nAantal pk: " + pk +
                "\nGemiddelde verbruik: " + gemVerbruik +
                "\nNummerplaat: " + nummerplaat);
    }

    @Override
    public void geefMilieuData() {
        System.out.println("--- Milieu data van voertuig ---");
        System.out.println("PK :" + getPk());
        System.out.println("Kostprijs :" + getKostprijs());
        System.out.println("Gem. verbruik :" + getGemVerbruik());
    }

    @Override
    public void geefPrivateData() {
        System.out.println("--- Private data van voertuig ---");
        System.out.println("Polishouder :" + getPolishouder());
        System.out.println("Nummerplaat :" + getNummerplaat());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voertuig voertuig)) {
            return false;
        }
        return nummerplaat.equals(voertuig.getNummerplaat());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nummerplaat);
    }

    @Override
    public int compareTo(Voertuig v) {
        return nummerplaat.compareTo(v.getNummerplaat());
    }
}

