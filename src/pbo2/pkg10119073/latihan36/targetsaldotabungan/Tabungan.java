package pbo2.pkg10119073.latihan36.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung lama
 * tabungan sampai mencapai saldo target dengan object oriented
 *
 */

public class Tabungan {
    public int saldo;
    public int bunga;

    public double hitungBunga(int saldo, int bunga) {
        return (saldo * bunga) / 100;
    }

    public void hitungLamaSaldoTarget(int saldo, int saldoTarget) {
        int i = 1;
        while (saldo <= saldoTarget) {
            hitungBunga(saldo, bunga);
            saldo += hitungBunga(saldo, bunga);

            String mataUang = String.format("Rp.%,3d",saldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + i + " %s%n", mataUang);
            i++;
        }
    }
}
