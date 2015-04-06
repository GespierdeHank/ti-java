package nl.martinbeentjes.rederij;

import java.util.ArrayList;

public class Map {
    private int aantalKaarten;
    private ArrayList<Kaart> kaartArrayList;

    public int creeerKaart() {
        Kaart kaart = new Kaart();
        this.kaartArrayList.add(kaart);
        this.updateAantalKaarten();
        return this.aantalKaarten;
    }

    public int creeerKaart(Kaart kaart) {
        this.kaartArrayList.add(kaart);
        this.updateAantalKaarten();
        leegMap();
        return this.aantalKaarten;
    }

    public void updateAantalKaarten() {
        if (!(aantalKaarten == kaartArrayList.size())) {
            this.aantalKaarten = kaartArrayList.size();
        }
    }

    public Kaart[] getKaarten() {
        return (Kaart[]) kaartArrayList.toArray();
    }


    public void leegMap() {
        this.kaartArrayList.clear();
    }
}
