package org.example;

public class VGA extends Colokan{
    public VGA(int harga, int promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        double hargaPasaran = 30000;
        double rasio = (this.harga * 100) / hargaPasaran;
        return ((rasio < 100) ? (this.promisedBandwidth * rasio) / 100 : this.promisedBandwidth);
    }
}
