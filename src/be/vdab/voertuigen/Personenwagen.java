package be.vdab.voertuigen;

import be.vdab.util.Vervuiler;

public class Personenwagen extends Voertuig implements Vervuiler {
    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;

    public Personenwagen() {
    }

    public Personenwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public final void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > 0) {
            this.aantalPassagiers = aantalPassagiers;
        }
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public final void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0) {
            this.aantalDeuren = aantalDeuren;
        }
    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik()*getPk() / aantalPassagiers;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + aantalDeuren + "; " + aantalPassagiers;
    }

    @Override
    public void toon() {
        System.out.println("\nPERSONENWAGEN");
        super.toon();
        System.out.println("Aantal deuren: " + aantalDeuren +
                "\nAantal passagiers: " + aantalPassagiers + "\n");
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore()*5.0;
    }
}
