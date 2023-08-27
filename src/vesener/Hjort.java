package vesener;

// Soete planteetere som, vel, spiser planter, og slipper ut karbon gjennom respirasjon.
public class Hjort {
    private double karbonRespirasjonrate;
    private double dekomposisjonKarbon;

    public Hjort(double karbonRespirasjonrate, double dekomposisjonKarbon) {
        this.karbonRespirasjonrate = karbonRespirasjonrate;
        this.dekomposisjonKarbon = dekomposisjonKarbon;
        // Antagelse: respirasjonraten er den samme gjennom hele livet. Mulig aa implementere metode for endring av denne.
    }

    public double dagligKarbonRespirasjon() {
        return karbonRespirasjonrate;
    }

    public double dekomposisjon() {
        return dekomposisjonKarbon;
    }
}
