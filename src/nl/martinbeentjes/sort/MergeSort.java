package nl.martinbeentjes.sort;

import java.util.ArrayList;

public class MergeSort {
    private int _n[];
    private int _h[];

    private int nc;

    public void doSort(int[] v) {
        this._n = v;
        this.nc = v.length;
        this._h = new int[this.nc];
        doMergeSort(0, this.nc - 1);
    }

    public int[] getResult() {
        return this._n;
    }

    private void doMergeSort(int l, int h) {
        if (l<h) {
            int m = (l + ((h - l) / 2));
            doMergeSort(l,m);
            doMergeSort(m+1,h);
            doMerge(l,m,h);
        }
    }

    private void doMerge(int l, int m, int h) {
        for (int i=l;i<=h;i++) {
            _h[i] = _n[i];
        }

        int i = l;
        int j = m+1;
        int k = l;

        while (i <= m && j <= h) {
            if (_h[i] <= _h[j]) {
                _n[k] = _h[i];
                i++;
            } else {
                _n[k] = _h[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            _n[k] = _h[i];
            k++;
            i++;
        }
    }
}
