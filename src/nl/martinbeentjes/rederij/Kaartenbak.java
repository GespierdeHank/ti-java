package nl.martinbeentjes.rederij;

import nl.martinbeentjes.sort.MergeSort;

import java.util.ArrayList;
import java.util.Collections;

public class Kaartenbak {
    public ArrayList<Kaart> kaartArrayList;
    private int cardsUntilNewSort;
    public Kaartenbak() {
        this.kaartArrayList = new ArrayList<Kaart>();
        this.cardsUntilNewSort = 0;
    }

    public void voegKaartenToe(Kaart[] kaarten) {
        Collections.addAll(this.kaartArrayList, kaarten);
        this.cardsUntilNewSort += kaarten.length;
        if (this.cardsUntilNewSort >= 10) {
            this.sort();
            this.cardsUntilNewSort = 0;
        }
    }

    public void sort() {
        // Create a sorter.
        MergeSort ms = new MergeSort();

        // Retrieve all the identificationumbers of the cards
        int ids[] = new int[this.kaartArrayList.size()];
        for (int i = 0; i < this.kaartArrayList.size(); i++ ) {
            ids[i] = this.kaartArrayList.get(i).getId();
        }

        // Sort the array of identificationnumbers
        ms.doSort(ids);

        // Save the sorted array to a new integer array. Also create a new arraylist for the sorted
        int newIds[] = ms.getResult();
        ArrayList<Kaart> newKaartList = new ArrayList<Kaart>();

        // Add all objects nicely sorted to the new arraylist.
        for (int i = 0; i < kaartArrayList.size(); i++) {
            newKaartList.add(this.kaartArrayList.get(newIds[i]));
        }

        // Update the arraylist
        this.kaartArrayList = newKaartList;
    }

}
