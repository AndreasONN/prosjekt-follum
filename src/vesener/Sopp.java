package vesener;

// Bryter ned doedt organisk materiale, og slipper i prosessen karbon tilbake ut i atmosfaeren.
public class Sopp {
    private double maksimaltDagligKarbonutslipp;
    private double karbonTilgjengeligForNedbryting;

    public Sopp(double maksimaltDagligKarbonutslipp) {
        this.maksimaltDagligKarbonutslipp = maksimaltDagligKarbonutslipp;
        // Antagelse: evnen til soppen i oekosystemet til aa bryte ned doede vesener endres aldri.
        // Mulig aa implementere metode for endring av denne.
        this.karbonTilgjengeligForNedbryting = 0;
    }

    public double dagligKarbonNedbryting() {
        // Hvis det er mindre karbon tilgjengelig for nedbryting enn soppen bryter ned paa en dag...
        if (karbonTilgjengeligForNedbryting < maksimaltDagligKarbonutslipp) {
            double karbonBruttNed = karbonTilgjengeligForNedbryting;
            karbonTilgjengeligForNedbryting = 0;
            return karbonBruttNed;
        }

        // Ellers...
        karbonTilgjengeligForNedbryting -= maksimaltDagligKarbonutslipp;
        return maksimaltDagligKarbonutslipp;
        // Forenkling: like mye karbon slippes ut gjennom nedbrytingsprosessen hver dag.
    }

    public void tilfoereDoedtOrganiskMateriale(double mengdeKarbon) {
        karbonTilgjengeligForNedbryting += mengdeKarbon;
    }

}
