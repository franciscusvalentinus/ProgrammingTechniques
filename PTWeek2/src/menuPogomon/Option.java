/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuPogomon;

/**
 *
 * @author franciscusvalentinus
 */
public class Option extends Fire {

    String pilihan;
    String status;
    static int hp;
    static int level;
    static int attack;
    static int defense;
    //String grade;

    public void Option(String pil) {
        this.pilihan = pil;
    }

    public void Pogo() {

        if (pilihan.equals("1")) {
            status = "fire";
            Fire fire = new Fire();
            fire.HP();
            fire.Level();
            fire.Attack();
            fire.Defense();
            level = fire.level;
            hp = fire.hp;
            attack = fire.attack;
            defense = fire.defense;
        }
        if (pilihan.equals("2")) {
            status = "water";
            Water water = new Water();
            water.HP();
            water.Level();
            water.Attack();
            water.Defense();
            hp = water.hp1;
            level = water.level1;
            attack = water.attack1;
            defense = water.defense1;
        }
         if (pilihan.equals("3")) {
            status = "earth";
            Earth earth = new Earth();
            earth.HP();
            earth.Level();
            earth.Attack();
            earth.Defense();
            hp = earth.hp2;
            level = earth.level2;
            attack = earth.attack2;
            defense = earth.defense2;
        }
    }
}
