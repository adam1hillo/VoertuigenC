package be.vdab;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;
import be.vdab.util.Vervuiler;
import be.vdab.verwarming.Stookketel;
import be.vdab.voertuigen.Personenwagen;
import be.vdab.voertuigen.Voertuig;
import be.vdab.voertuigen.Vrachtwagen;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TestProgramma {
    public static void main(String[] args) {

        var opel1 = new Personenwagen();

        var opel2 = new Personenwagen("Jan Klaasen",
                14599.0F, 105, 6.8F, "1-KLM-099", 5, 5);
        var volvo1 = new Vrachtwagen();
        var volvo2 = new Vrachtwagen("Michel Dewolf",
                214599.0F, 440, 33.1F, "1-PRD-441", 6000.0F);

        Set<Voertuig> voertuigen = new TreeSet<>();
        voertuigen.add(opel2);
        voertuigen.add(new Personenwagen("Piet Peeters", 18321.0F, 110, 7.1F, "1-OPQ-099", 5, 5));
        voertuigen.add(volvo2);
        voertuigen.add(new Vrachtwagen("Jan Vos", 254612.0F, 450, 33.1F, "1-AZE-123", 6200.0F));
        System.out.println("\n*** TreeSet van voertuigen ***");
        for (Voertuig voertuig : voertuigen) {
            System.out.println(voertuig);
        }
    }
}
