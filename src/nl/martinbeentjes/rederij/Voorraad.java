package nl.martinbeentjes.rederij;

import java.util.ArrayList;

public class Voorraad {
    private ArrayList<Motor> motorArrayList;
    private ArrayList<Electra> electraArrayList;
    private ArrayList<WaterVoorziening> waterVoorzieningArrayList;
    private ArrayList<Interieur> interieurArrayList;

    public Voorraad() {
        this.electraArrayList = new ArrayList<Electra>();
        this.interieurArrayList = new ArrayList<Interieur>();
        this.motorArrayList = new ArrayList<Motor>();
        this.waterVoorzieningArrayList = new ArrayList<WaterVoorziening>();
    }
}
