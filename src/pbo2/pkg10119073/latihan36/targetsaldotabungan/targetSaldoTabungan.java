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

public class targetSaldoTabungan {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        tabungan.saldo = 3500000;
        tabungan.bunga = 8;
        int saldoTarget = 6000000;
        tabungan.hitungLamaSaldoTarget(tabungan.saldo, saldoTarget);
    }
    
}
