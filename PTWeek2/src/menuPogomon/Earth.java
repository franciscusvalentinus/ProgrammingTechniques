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
public class Earth implements Pogodata {

   int hp2;
   int level2;
   int attack2;
   int defense2;

    @Override
    public void Level() {
      level2 = 1;
    }

    @Override
    public void HP() {
       hp2 = 20;
    }

    @Override
    public void Attack() {
       attack2 = 15;
    }

    @Override
    public void Defense() {
       defense2 = 20;
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