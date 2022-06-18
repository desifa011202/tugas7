/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7pbo;

/**
 *
 * @author desif
 */
public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public String toString() {
        String print = "";

        System.out.printf("%-20s: %s%n", "Pegawai Tetap", getNama());
        print += String.format("%-20s: %.1f%n", "Upah", getUpah());
        print += String.format("%-20s: Rp %d%n", "Pendapatan", (int)(getUpah()));

        return super.toString() + print;
    }

}