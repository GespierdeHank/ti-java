package nl.martinbeentjes.rederij;

import java.util.ArrayList;
import java.util.Iterator;

public class Scheepswerf {
    private ArrayList<Boot> bootArrayList;
    private Map nieuweKaartenMap;
    private Kaartenbak kaartenbak;


    public Scheepswerf() {
        this.bootArrayList = new ArrayList<Boot>();
        this.nieuweKaartenMap = new Map();
        this.kaartenbak = new Kaartenbak();
    }

    /*
        Vraag aan Jeroen: Ik gebruik hier niet direct 12345 maar als parameter. Op het sequentie diagram staat
                          echter 'identificatienummer == 12345'. Moet je dan perse 12345 gebruiken en geen parameters?
     */
    public String geefKlantNaam(int id) {
        Boot b = new Boot();

        // Iterator gebruiken?
        for (Iterator<Boot> iterator = this.bootArrayList.iterator(); iterator.hasNext(); ) {
            if (iterator.next().getIdentificatienummer() == id)
            {
                b = iterator.next();
                break;
            }
        }

        // Of een ouderwets forloopje?
        for (int i = 0; i < this.bootArrayList.size(); i++) {
            if (this.bootArrayList.get(i).getIdentificatienummer() == 12345) {
                b = this.bootArrayList.get(i);
                break;
            }
        }

        return b.getNaamToekomstigeEigenaar();
    }

    public int geefFaseBoot(int id) {
        Boot boot = new Boot();
        for (Iterator<Boot> iterator = this.bootArrayList.iterator(); iterator.hasNext(); ) {
            if (iterator.next().getIdentificatienummer() == id) {
                boot = iterator.next();
                break;
            }
        }

        if (boot.getIdentificatienummer() == id) {
            return boot.geefFase();
        }


        return -1;
    }

    public void KaartToevoegen(Kaart kaart) {
        int aantalKaarten = this.nieuweKaartenMap.creeerKaart(kaart);

        if (aantalKaarten == 10) {
            this.kaartenbak.voegKaartenToe(this.nieuweKaartenMap.getKaarten());
            this.nieuweKaartenMap.leegMap();
        }
    }
}
