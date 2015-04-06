package nl.martinbeentjes.rederij;

public class Boot {
    private int identificatienummer;
    private String klantNaam;
    private ToekomstigeEigenaar toekomstigeEigenaar;

    private Binnenwerk binnenwerk;
    private Kiel kiel;
    private Dek dek;
    private Opbouw opbouw;
    private Fase fase;

    public Boot() {
        this.binnenwerk = new Binnenwerk();
        this.kiel = new Kiel();
        this.dek = new Dek();
        this.opbouw = new Opbouw();
    }

    public int getIdentificatienummer() {
        return identificatienummer;
    }

    public void setIdentificatienummer(int identificatienummer) {
        this.identificatienummer = identificatienummer;
    }

    public String getKlantNaam() {
        return klantNaam;
    }

    public void setKlantNaam(String klantNaam) {
        this.klantNaam = klantNaam;
    }

    public ToekomstigeEigenaar getToekomstigeEigenaar() {
        return toekomstigeEigenaar;
    }

    public void setToekomstigeEigenaar(ToekomstigeEigenaar toekomstigeEigenaar) {
        this.toekomstigeEigenaar = toekomstigeEigenaar;
    }

    public String getNaamToekomstigeEigenaar() {
        return toekomstigeEigenaar.getNaam();
    }

    public int geefFase() {
        return this.fase.ordinal();
    }

    private class Opbouw {

    }

    private class Dek {

    }

    private class Kiel {

    }

    private class Binnenwerk {
        private Motor motor;
        private Electra electra;
        private WaterVoorziening waterVoorziening;
        private Interieur interieur;
    }

    private enum Fase {
        KIEL_BOUWEN,
        BINNEWERK_INBOUWEN,
        OPBOUW_BOUWEN,
        SCHILDEREN
    }
}
