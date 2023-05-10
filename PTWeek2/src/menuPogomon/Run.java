/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuPogomon;
import menuPogomon.interface1.process;

/**
 *
 * @author franciscusvalentinus
 */
public class Run implements process {
Option op = new Option();
    @Override
    public void tier() {
        if (op.hp < 40) {
            InterfaceStart.grade = "Rookie";
        } else if (op.hp >= 40 && op.hp < 60) {
            InterfaceStart.grade = "Adult";
        } else if (op.hp >= 60 && op.hp < 70) {
            InterfaceStart.grade = "Master";
        } else if (op.hp >= 70) {
            InterfaceStart.grade = "GOD";
        }
    }

    @Override
    public void rule() {
       
    }

    @Override
    public void condition() {
      if (InterfaceStart.happiness == 7 && InterfaceStart.hungryness == 7 && InterfaceStart.cleanness == 7) {
                InterfaceStart.condition = "perfect";
            } else if (InterfaceStart.happiness < 7 || InterfaceStart.hungryness < 7 || InterfaceStart.cleanness < 7) {
                InterfaceStart.condition = "good";
            } 
    }

    @Override
    public void level() {
        if (op.hp <= 30) {
                op.level = 1;
            } else if (op.hp >= 30 && op.hp < 40) {
                op.level = 2;
            } else if (op.hp >= 40 && op.hp < 50) {
                op.level = 3;
            } else if (op.hp >= 50 && op.hp < 60) {
                op.level = 4;
            } else if (op.hp >= 60 && op.hp < 70) {
                op.level = 5;
            } else if (op.hp >= 70) {
                op.level = 6;
            }
    }

}
