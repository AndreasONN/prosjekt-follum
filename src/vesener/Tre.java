package vesener;

// Primaerprodusent, absorberer atmosfaerisk karbon under fotosyntese.
public class Tre {
    private double karbonAbsorpsjonsrate;
    private double dekomposisjonKarbon;

    public Tre(double karbonAbsorpsjonsrate, double dekomposisjonKarbon) {
        this.karbonAbsorpsjonsrate = karbonAbsorpsjonsrate;
        this.dekomposisjonKarbon = dekomposisjonKarbon;
        // Antagelse: absorsjonsraten endres aldri. Mulig aa implementere metode for endring av denne.
    }

    public double dagligKarbonsabsorpsjon() {
        return karbonAbsorpsjonsrate;
    }

    public double dekomposisjon() {
        return dekomposisjonKarbon;
    }
}
