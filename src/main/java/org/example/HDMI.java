package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, int promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        double hargaPasaran = 50000;
        double rasio = (this.harga * 100) / hargaPasaran;
        return ((rasio < 100) ? (this.promisedBandwidth * rasio) / 100 : this.promisedBandwidth);
    }
}
