package Matriks;

public class Matriks {
    private int[][] matriks;
    private String namamatriks;
    private int baris;
    private int kolom;
    public Matriks(String namamatriks, int baris, int kolom){
        this.namamatriks = namamatriks;
        this.baris = baris;
        this.kolom = kolom;
        this.matriks = new int[baris][kolom];
    }

    public void setElemen(int baris, int kolom, int nilai){
        this.matriks[baris][kolom] = nilai;
    }

    public int getElemen(int baris, int kolom){
        return this.matriks[baris][kolom];
    }

    public int getBaris() {
        return this.baris;
    }
    public int getKolom() {
        return this.kolom;
    }

    public String getNamamatriks(){
        return this.namamatriks;
    }

    public void isimatriks(){
        System.out.println("Isi dari " + getNamamatriks() + " :");
        for (int i = 0; i < getBaris(); i++) {
            for (int j = 0; j < getKolom(); j++) {
                System.out.print(getElemen(i, j) + " ");
            }
            System.out.println();
        }
    }

    public Matriks penjumlahan(Matriks other){
        Matriks hasilpenjumlahan = new Matriks("Hasil Penjumlahan Matriks", 2, 3);
        for(int i = 0; i < this.getBaris(); i++) {
            for (int j = 0; j < this.getKolom(); j++) {
                int nilai = this.getElemen(i, j) + other.getElemen(i, j);
                hasilpenjumlahan.setElemen(i, j, nilai);
            }
        }
        return hasilpenjumlahan;
    }

    public Matriks pengurangan(Matriks other){
        Matriks hasilpengurangan = new Matriks("Hasil Pengurangan Matriks", 2, 3);
        for(int i = 0; i < this.getBaris(); i++) {
            for (int j = 0; j < this.getKolom(); j++) {
                int nilai = this.getElemen(i, j) - this.getElemen(i, j);
                hasilpengurangan.setElemen(i, j, nilai);
            }
        }
        return hasilpengurangan;
    }

    public Matriks dot(){
        for(int i = 0; i < getBaris(); i++) {
            for (int j = 0; j < getKolom(); j++) {
                if(getElemen(i, j) == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        return null;
    }
}
