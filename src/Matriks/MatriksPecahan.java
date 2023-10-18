package Matriks;
import Pecahan.Pecahan;

public class MatriksPecahan extends Matriks{
    private Pecahan[][] data;
    private int baris;
    private int kolom;
    public MatriksPecahan(String namamatriks, int baris, int kolom) {
        super(namamatriks, kolom, baris);
        this.baris = baris;
        this.kolom = kolom;
        this.data = new Pecahan[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                this.data[i][j] = new Pecahan(0, 1);
            }
        }
    }
    public void setElemen(int baris, int kolom, Pecahan nilai) {
        this.data[baris][kolom] = nilai;
    }
    public Pecahan getElemenPecahan(int baris, int kolom) {
        return this.data[baris][kolom];
    }

    public int getBaris() {
        return this.baris;
    }
    public int getKolom() {
        return this.kolom;
    }

    @Override
    public void isimatriks(){
        System.out.println("Isi dari " + getNamamatriks() + " :");
        for (int i = 0; i < getBaris(); i++) {
            for (int j = 0; j < getKolom(); j++) {
                System.out.print(getElemenPecahan(i, j) + " ");
            }
            System.out.println();
        }
    }

    public MatriksPecahan penjumlahanMP(MatriksPecahan MP2){
        MatriksPecahan hasil = new MatriksPecahan("Hasil Penjumlahan", this.baris, this.kolom);
        for (int i = 0; i < this.getBaris(); i++) {
            for (int j = 0; j < this.getKolom(); j++) {
                Pecahan nilai = this.getElemenPecahan(i, j).penjumlahan(MP2.getElemenPecahan(i, j));
                hasil.setElemen(i, j, nilai);
            }
        }
        return hasil;
    }

    public MatriksPecahan penguranganMP(MatriksPecahan MP2){
        MatriksPecahan hasil = new MatriksPecahan("Hasil Pengurangan", this.baris, this.kolom);
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                Pecahan nilai = this.getElemenPecahan(i, j).pengurangan(MP2.getElemenPecahan(i, j));
                hasil.setElemen(i, j, nilai);
            }
        }
        return hasil;
    }

    public static MatriksPecahan dotMP(MatriksPecahan MP2, MatriksPecahan MP3){
        MatriksPecahan hasil = new MatriksPecahan("Hasil Dot Product", MP2.getBaris(), MP3.getKolom());
        for (int i = 0; i < MP2.getBaris(); i++) {
            for (int j = 0; j < MP3.getKolom(); j++) {
                Pecahan nilai = new Pecahan(0, 1);
                for (int k = 0; k < MP2.getKolom(); k++) {
                    nilai = nilai.penjumlahan(MP2.getElemenPecahan(i, k).perkalian(MP3.getElemenPecahan(k, j)));
                }
                hasil.setElemen(i, j, nilai);
            }
        }
        return hasil;
    }

    public MatriksPecahan transposeMP(){
        MatriksPecahan hasil = new MatriksPecahan("Hasil Transpose", getKolom(), getBaris());
        for (int i = 0; i < getBaris(); i++) {
            for (int j = 0; j < getKolom(); j++) {
                hasil.setElemen(j, i, getElemenPecahan(i, j));
            }
        }
        return hasil;
    }
}