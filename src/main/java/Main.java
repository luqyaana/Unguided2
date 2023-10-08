import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        boolean keluar = false;
        int pilihan = -1;
        String ulang;
        do {
            System.out.println("MENU OPERASI TITK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = masukkan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("MASUKAN KOORDINAT TITIK 1 (X Y): ");
                    int x1 = masukkan.nextInt();
                    int y1 = masukkan.nextInt();
                    t1.inisialisasiTitik(x1, y1);
                    System.out.print("MASUKAN KOORDINAT TITIK 2 (X Y): ");
                    int x2 = masukkan.nextInt();
                    int y2 = masukkan.nextInt();
                    t2.inisialisasiTitik(x2, y2);
                    System.out.print("Keluar? (y/t): ");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    }else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih telah menggunakan program ini! Sampai Jumpa!");
                    }else{
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 2:
                    System.out.print("TITIK 1: ");
                    t1.tampilTitik();
                    System.out.print("TITIK 2: ");
                    t2.tampilTitik();
                    System.out.print("Keluar? (y/t): ");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    }else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih telah menggunakan program ini! Sampai Jumpa!");
                    }else{
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 3:
                    System.out.print("MASUKKAN SKALAR: ");
                    int skalar = masukkan.nextInt();
                    t1.perkalianSkalar(skalar);
                    t2.perkalianSkalar(skalar);
                    System.out.print("TITIK 1: ");
                    t1.tampilTitik();
                    System.out.print("TITIK 2: ");
                    t2.tampilTitik();
                    System.out.print("Keluar? (y/t): ");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    }else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih telah menggunakan program ini! Sampai Jumpa!");
                    }else{
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 4:
                    t1.pencerminanSumbuX();
                    t2.pencerminanSumbuX();
                    System.out.print("TITIK 1: ");
                    t1.tampilTitik();
                    System.out.print("TITIK 2: ");
                    t2.tampilTitik();
                    System.out.print("Keluar? (y/t): ");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    }else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih telah menggunakan program ini! Sampai Jumpa!");
                    }else{
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 5:
                    t1.pencerminanSumbuY();
                    t2.pencerminanSumbuY();
                    System.out.print("TITIK 1: ");
                    t1.tampilTitik();
                    System.out.print("TITIK 2: ");
                    t2.tampilTitik();
                    System.out.print("Keluar? (y/t): ");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    }else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih telah menggunakan program ini! Sampai Jumpa!");
                    }else{
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 6:
                    int jarak = t1.jarak(t2);
                    System.out.println("Jarak antara Titik 1 dan Titik 2: " + jarak);
                    System.out.print("Keluar? (y/t): ");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    }else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih telah menggunakan program ini! Sampai Jumpa!");
                    }else{
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini! Sampai Jumpa!");
                    keluar = true;
                    break;
                default:
                    System.out.println("Pilihan tidak ditemukan");
                    System.out.print("Masukkan ulang pilihan (y/t): ");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("y")) {
                        keluar = false;
                    }else if (ulang.equalsIgnoreCase("t")) {
                        keluar = true;
                        System.out.println("Terima kasih telah menggunakan program ini! Sampai Jumpa!");
                    }else{
                        System.out.println("Pilihan tidak ditemukan");
                    }

            }

        }while(keluar == false);

    }
}