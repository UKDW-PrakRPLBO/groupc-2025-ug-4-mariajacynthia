package org.example;

public abstract class Colokan {
    protected String merk;
    protected double promisedBandwidth;
    protected int harga;
    protected int hargaPasaran;

    public Colokan(int harga, int promisedBandwidth, String merk) {
        this.harga = harga;
        this.promisedBandwidth = promisedBandwidth;
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHargaPasaran() {
        return hargaPasaran;
    }

    public void setHargaPasaran(int hargaPasaran) {
        this.hargaPasaran = hargaPasaran;
    }

    public abstract double getRealBandwidth();
}
