/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuPogomon;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author franciscusvalentinus
 */
public class InterfaceStart extends Option {

    Scanner scan = new Scanner(System.in);
    static int token = 10;
    static String grade = "rookie";
    static int happiness = 7;
    static int hungryness = 7;
    static int cleanness = 7;
    int hpt;
    static String condition = "perfect";
    Option option = new Option();
    Aktivitas akt = new Aktivitas();
    Run r = new Run();
    static String tra = "";
    int pilih;

    public void cetakMenu() {
        System.out.println("============================");
        System.out.println("||Selamat datang dibattle area||");
        System.out.println("============================");
        System.out.print(">> Namamu : ");
        String name = scan.nextLine();
        System.out.println("============================");
        System.out.println("Silahkan pilih elemen Pogomonmu :");
        System.out.println("1.Fire  2.Water  3.Earth");
        System.out.print("Pilihanmu : ");
        String pil = scan.nextLine();
        tra = pil;
        System.out.print("Masukkan nama POGOMON mu : ");
        String yourPogomon = scan.nextLine();
        System.out.println("============================");
        Option(pil);
        Pogo();
        hpt = hp;
        while (true) {
            if (hp > hpt) {
                hpt = hp;
            }
            System.out.println("Hi, " + name + "! Tokenmu: " + token + "pts");
            System.out.println("::" + yourPogomon + "(" + status + ") Status::");
            if (happiness > 7) {
                happiness = 7;
            }
            if (hungryness > 7) {
                hungryness = 7;
            }
            if (cleanness > 7) {
                cleanness = 7;
            }
            System.out.println("Condition: *" + condition + "*");
            System.out.println("Level   :" + level + "    ||Grade        :" + grade);
            System.out.print("Hp      :" + hp + "/" + hpt + "||happiness    :");
            for (int i = 1; i <= happiness; i++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.print("Attack  :" + attack + "   ||hungryness   :");
            for (int i = 1; i <= hungryness; i++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.print("Defense :" + defense + "   ||cleanness    :");
            for (int i = 1; i <= cleanness; i++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("====================");
            System.out.println("==Daftar Aktivitas==");
            System.out.println("====================");
            System.out.println("::1. Makan");
            System.out.println("::2. Mandi");
            System.out.println("::3. Tidur");
            System.out.println("::4. Main");
            System.out.println("::5. Training");
            System.out.println("::6. Kerja");
            System.out.println("::7. Keluar");
            System.out.println("::::::::::::::::::::");
            System.out.println("Mau yang mana?");
            try {
                Scanner scan = new Scanner(System.in);
                pilih = scan.nextInt();
                if (pilih > 7 || pilih < 1) {
                    System.out.println("inputan hanya 1 sampai 7!");
                    System.out.println("!-------------------------!\n");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Inputan tidak boleh String!");
                System.out.println("!-------------------------!\n");
            }
            if (pilih == 1) {
                if (token >= 2) {
                    akt.makan();
                } else if (token < 2) {
                    System.out.println("Not enough token :P");
                }
            } else if (pilih == 2) {
                akt.mandi();
            } else if (pilih == 3) {
                akt.tidur();
            } else if (pilih == 4) {
                akt.main();
            } else if (pilih == 5) {
                if (token >= 5) {
                    akt.training();
                } else if (token < 5) {
                    System.out.println("Not enough token :P");
                }
            } else if (pilih == 6) {
                akt.kerja();
            } else if (pilih == 7) {
                akt.keluar();
                break;
            }
            r.level();
            r.condition();
            r.tier();
            if (happiness < 1 || hungryness < 1 || cleanness < 1) {
                System.out.println("SELAMAT ATAS KEKALAHAN ANDA !!!");
                break;
            } else if (grade.equals("GOD") && level == 6) {
                System.out.println(name + "SELAMAT ATAS KEMENANGAN ANDA !!!");
                break;
            }
        }
    }
}