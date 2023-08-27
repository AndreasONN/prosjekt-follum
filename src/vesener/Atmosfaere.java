package vesener;

// Funker som baade karbonsluk og kilde til karbon.
public class Atmosfaere {
    private double atmosfaeriskKarbon;

    public Atmosfaere(double initiellAtmosfaeriskKarbon) {
        this.atmosfaeriskKarbon = initiellAtmosfaeriskKarbon;
    }

    public void mottaKarbon(double mengdeKarbon) {
        atmosfaeriskKarbon += mengdeKarbon;
    }

    public void giKarbon(double mengdeKarbon) throws Error {
        // TODO: behandle denne feilmeldingen riktig i resten av simuleringen.
        if ((atmosfaeriskKarbon - mengdeKarbon) < 0) {
            throw new Error("Ikke nok karbon i atmosfaeren!");
        }
        atmosfaeriskKarbon -= mengdeKarbon;
    }

    public double mengdeAtmosfaeriskKarbon() {
        return atmosfaeriskKarbon;
    }
}
