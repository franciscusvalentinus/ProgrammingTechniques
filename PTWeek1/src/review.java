
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author franciscusvalentinus
 */
public class review {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        review a = new review();
        a.menu();
    }

    public void menu() {
        System.out.println("====================");
        System.out.println("== MENU PERMAINAN ==");
        System.out.println("====================");
        System.out.println("= 1. Bangun Rumah  =");
        System.out.println("= 2. Tebak Gambar  =");
        System.out.println("= 3. Keluar        =");
        System.out.println("====================");
        System.out.print("==> Pilihan Menu: ");
        int pilih = scan.nextInt();

        if (pilih == 1) {
            rumah();
        } else if (pilih == 2) {
            tebak();
        } else if (pilih == 3) {
            finish();
        }
    }

    public void rumah() {
        int trumah;
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukkan tinggi rumah : ");
        trumah = scan.nextInt();
        for (int i = 1; i <= trumah; i++) {
            for (int j = trumah - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("T");
            }
            for (int j = 1; j < trumah * 2; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        for (int i = 1; i <= trumah; i++) {
            for (int j = 1; j < (trumah * 3) + trumah - 1; j++) {
                System.out.print("H");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Selamat, Jawabanmu Benar!");
        System.out.println("Main lagi (Y/N)?");
        String pilih = scan.next();
        if (pilih.equalsIgnoreCase("Y")) {
            menu();
        } else if (pilih.equalsIgnoreCase("N")) {
            finish();
        }
    }

    public void tebak() {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            soal1();
        } else if (random == 1) {
            soal2();
        } else if (random == 2) {
            soal3();
        }
    }

    public void soal1() {
        System.out.println("   *******");
        System.out.println("  *********");
        System.out.println("HHHHHHHHHHHHHH");
        System.out.println("HHHHHHHHHHHHHH");
        System.out.println("  ***     ***");
        System.out.println("Gambar apa yang ada di atas?");
        System.out.println("a. Motor        b. Mobil");
        System.out.println("c. Kapal        d. Tank");
        System.out.println("-----------------------------");
        System.out.print("Jawabanmu?");
        String jawaban = scan.next();
        System.out.println("");
        if (jawaban.equalsIgnoreCase("b")) {
            System.out.println("Selamat, Jawabanmu Benar!");
            System.out.println("Main lagi (Y/N)?");
            String pilih = scan.next();
            if (pilih.equalsIgnoreCase("Y")) {
                menu();
            } else if (pilih.equalsIgnoreCase("N")) {
                finish();
            }
        } else {
            System.out.println("Maaf, Jawabanmu Salah!");
            System.out.println("Main lagi (Y/N)?");
            String pilih = scan.next();
            if (pilih.equalsIgnoreCase("Y")) {
                menu();
            } else if (pilih.equalsIgnoreCase("N")) {
                finish();
            }
        }
        System.out.println("");
    }

    public void soal2() {
        System.out.println("   *");
        System.out.println("   **");
        System.out.println("   ***");
        System.out.println("   ****");
        System.out.println("   *");
        System.out.println("**********");
        System.out.println(" ********");
        System.out.println("Gambar apa yang ada di atas?");
        System.out.println("a. Pesawat      b. Perahu");
        System.out.println("c. Mobil balap  d. Kapal selam");
        System.out.println("------------------------------");
        String jawaban = scan.next();
        System.out.println("");
        if (jawaban.equalsIgnoreCase("b")) {
            System.out.println("Selamat, Jawabanmu Benar!");
            System.out.println("Main lagi (Y/N)?");
            String pilih = scan.next();
            if (pilih.equalsIgnoreCase("Y")) {
                menu();
            } else if (pilih.equalsIgnoreCase("N")) {
                finish();
            }
        } else {
            System.out.println("Maaf, Jawabanmu Salah!");
            System.out.println("Main lagi (Y/N)?");
            String pilih = scan.next();
            if (pilih.equalsIgnoreCase("Y")) {
                menu();
            } else if (pilih.equalsIgnoreCase("N")) {
                finish();
            }
        }
        System.out.println("");
    }

    public void soal3() {
        System.out.println("     *******");
        System.out.println("    *********");
        System.out.println("HHHHHHHHHHHHHHH");
        System.out.println("  HHHHHHHHHHHHH");
        System.out.println("   ***    ***");
        System.out.println("Gambar apa yang ada di atas?");
        System.out.println("a. Motor        b. Mobil");
        System.out.println("c. Kapal        d. Tank");
        System.out.println("----------------------------");
        String jawaban = scan.next();
        System.out.println("");
        if (jawaban.equalsIgnoreCase("d")) {
            System.out.println("Selamat, Jawabanmu Benar!");
            System.out.println("Main lagi (Y/N)?");
            String pilih = scan.next();
            if (pilih.equalsIgnoreCase("Y")) {
                menu();
            } else if (pilih.equalsIgnoreCase("N")) {
                finish();
            }
        } else {
            System.out.println("Maaf, Jawabanmu Salah!");
            System.out.println("Main lagi (Y/N)?");
            String pilih = scan.next();
            if (pilih.equalsIgnoreCase("Y")) {
                menu();
            } else if (pilih.equalsIgnoreCase("N")) {
                finish();
            }
        }
        System.out.println("");
    }

    public void finish() {
        System.out.println("");
        System.out.println("||||||||||||||||||||");
        System.out.println("");
        System.out.println("Franciscus Valentinus Ongkosianbhadra - 0706011910004");

    }

}
