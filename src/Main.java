import Matriks.*;
import Pecahan.Pecahan;
import javax.management.MBeanAttributeInfo;

public class Main {
    public static void main(String[] args) {
        Pecahan pecahan1 = new Pecahan(1,2);
        Pecahan pecahan2 = new Pecahan(1,3);

        Pecahan hasil1 = pecahan1.penjumlahan(pecahan2);
        Pecahan hasil2 = pecahan1.pengurangan(pecahan2);
        Pecahan hasil3 = pecahan1.perkalian(pecahan2);
        Pecahan hasil4 = pecahan1.pembagian(pecahan2);

        System.out.println("Class Pecahan");
        pecahan1.nilaipecahan();
        pecahan2.nilaipecahan();
        System.out.println("Hasil Penjumlahan Pecahan 1 dan Pecahan 2 adalah " + hasil1.toString());
        System.out.println("Hasil Pengurangan Pecahan 1 dan Pecahan 2 adalah " + hasil2.toString());
        System.out.println("Hasil Perkalian Pecahan 1 dan Pecahan 2 adalah " + hasil3.toString());
        System.out.println("Hasil Pembagian Pecahan 1 dan Pecahan 2 adalah " + hasil4.toString());

        System.out.println();
        System.out.println("Class Matriks Pecahan");
        MatriksPecahan A = new MatriksPecahan("Matriks Pecahan A", 2, 2);
        A.setElemen(0,0, new Pecahan(1,2));
        A.setElemen(0,1,new Pecahan(2,3));
        A.setElemen(1,0,new Pecahan(1,3));
        A.setElemen(1,1,new Pecahan(3,2));

        MatriksPecahan B = new MatriksPecahan("Matriks Pecahan B", 2, 2);
        B.setElemen(0,0, new Pecahan(3,2));
        B.setElemen(0,1,new Pecahan(1,3));
        B.setElemen(1,0,new Pecahan(2,3));
        B.setElemen(1,1,new Pecahan(1,2));

        MatriksPecahan C = A.penjumlahanMP(B);
        MatriksPecahan D = A.penguranganMP(B);
        MatriksPecahan E = MatriksPecahan.dotMP(A, B);
        MatriksPecahan F = A.transposeMP();

        A.isimatriks();
        B.isimatriks();
        C.isimatriks();
        D.isimatriks();
        E.isimatriks();
        F.isimatriks();
    }
}