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
public class Water implements Pogodata {

   int hp1;
   int level1;
   int attack1;
   int defense1;

    @Override
    public void Level() {
      level1 = 1;
    }

    @Override
    public void HP() {
       hp1 = 20;
    }

    @Override
    public void Attack() {
       attack1 = 10;
    }

    @Override
    public void Defense() {
       defense1 = 15;
    }

    @Override
    public void Grade() {
        String grade = "rookie";
    }

    @Override
    public void Happiness() {

    }

    @Override
    public void hungryness() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Cleanness() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
