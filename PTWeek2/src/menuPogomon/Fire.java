/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuPogomon;
import menuPogomon.interface1.Pogodata;

/**
 *
 * @author franciscusvalentinus
 */
public class Fire implements Pogodata {

    int hp;
    int level;
    int attack;
    int defense;
    int happiness;
    int hungryness;
    String grade;
    int cleanness;

    @Override
    public void Level() {
        level = 1;
    }

    @Override
    public void HP() {
        hp = 20;
    }

    @Override
    public void Attack() {
        attack = 20;
    }

    @Override
    public void Defense() {
        defense = 10;
    }

    @Override
    public void Grade() {
        grade = "rookie";
    }

    @Override
    public void Happiness() {
        happiness = 7;
    }

    @Override
    public void hungryness() {
        hungryness = 7;
    }

    @Override
    public void Cleanness() {
        cleanness = 7;
    }

}