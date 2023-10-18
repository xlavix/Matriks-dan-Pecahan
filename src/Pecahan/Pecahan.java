package Pecahan;

public class Pecahan {
    public int pembilang;
    public int penyebut;

    public Pecahan(int pembilang, int penyebut){
        this.pembilang = pembilang;
        if (penyebut != 0) {
            this.penyebut = penyebut;
        } else {
            System.out.println("Penyebut tidak bisa menggunakan nilai 0. Atur menjadi nilai 1.");
            this.penyebut = 1;
        }
    }

    public Pecahan penjumlahan(Pecahan other) {
        int pembilangbaru = this.pembilang * other.penyebut + other.pembilang * this.penyebut;
        int penyebutbaru = this.penyebut * other.penyebut;
        return new Pecahan(pembilangbaru, penyebutbaru);
    }
    public Pecahan pengurangan(Pecahan other) {
        int pembilangbaru = this.pembilang * other.penyebut - other.pembilang * this.penyebut;
        int penyebutbaru= this.penyebut * other.penyebut;
        return new Pecahan(pembilangbaru, penyebutbaru);
    }
    public Pecahan perkalian(Pecahan other) {
        int pembilangbaru = this.pembilang * other.pembilang;
        int penyebutbaru = this.penyebut * other.penyebut;
        return new Pecahan(pembilangbaru, penyebutbaru);
    }
    public Pecahan pembagian(Pecahan other) {
        int pembilangbaru = this.pembilang * other.penyebut;
        int penyebutbaru = this.penyebut * other.pembilang;
        return new Pecahan(pembilangbaru, penyebutbaru);
    }

    @Override
    public String toString() {
        return pembilang + "/" + penyebut;
    }

    public void nilaipecahan(){
        System.out.println(this.pembilang + "/" + this.penyebut);
    }
}