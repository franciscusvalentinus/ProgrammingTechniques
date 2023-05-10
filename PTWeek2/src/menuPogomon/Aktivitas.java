/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuPogomon;
import menuPogomon.interface1.AktivitasData;

/**
 *
 * @author franciscusvalentinus
 */
public class Aktivitas implements AktivitasData {

    Option op = new Option();
    //urutannya
    //==fire==
    //==water==
    //==earth==

    @Override
    public void makan() {
        if (InterfaceStart.tra.equals("1")) {
            InterfaceStart.token -= 2;
            op.hp += 4;
            InterfaceStart.hungryness = 7;
            InterfaceStart.cleanness -= 1;
            InterfaceStart.happiness += 2;
        } else if (InterfaceStart.tra.equals("2")) {
            InterfaceStart.token -= 1;
            op.hp += 3;
            InterfaceStart.hungryness = 7;
            InterfaceStart.cleanness -= 1;
            InterfaceStart.happiness += 3;
        } else if (InterfaceStart.tra.equals("3")) {
            InterfaceStart.token -= 3;
            op.hp += 3;
            InterfaceStart.hungryness = 7;
            InterfaceStart.cleanness -= 1;
            InterfaceStart.happiness += 3;
        }
    }

    @Override
    public void mandi() {
        if (InterfaceStart.tra.equals("1")) {
            op.hp += 2;
            InterfaceStart.hungryness -= 1;
            InterfaceStart.cleanness = 7;
            InterfaceStart.happiness += 1;
        } else if (InterfaceStart.tra.equals("2")) {
            op.hp += 5;
            InterfaceStart.cleanness = 7;
            InterfaceStart.happiness += 1;
        } else if (InterfaceStart.tra.equals("3")) {
            op.hp += 1;
            InterfaceStart.cleanness = 7;
            InterfaceStart.happiness += 1;
        }
    }

    @Override
    public void tidur() {
        if (InterfaceStart.tra.equals("1")) {
            op.hp += 8;
            InterfaceStart.hungryness -= 1;
            InterfaceStart.cleanness -= 1;
            InterfaceStart.happiness -= 1;
        } else if (InterfaceStart.tra.equals("2")) {
            op.hp += 9;
            InterfaceStart.hungryness -= 2;
            InterfaceStart.cleanness -= 1;
            InterfaceStart.happiness += 2;
        } else if (InterfaceStart.tra.equals("3")) {
            op.hp += 8;
            InterfaceStart.hungryness -= 1;
            InterfaceStart.cleanness -= 2;
            InterfaceStart.happiness += 2;
        }
    }

    @Override
    public void main() {
        if (InterfaceStart.tra.equals("1")) {
            InterfaceStart.hungryness -= 1;
            InterfaceStart.cleanness -= 1;
            InterfaceStart.happiness = 7;
        } else if (InterfaceStart.tra.equals("2")) {
            InterfaceStart.hungryness -= 2;
            InterfaceStart.cleanness -= 2;
            InterfaceStart.happiness = 7;
        } else if (InterfaceStart.tra.equals("3")) {
            InterfaceStart.hungryness -= 2;
            InterfaceStart.cleanness -= 1;
            InterfaceStart.happiness = 7;
        }
    }

    @Override
    public void training() {
        if (InterfaceStart.tra.equals("1")) {
            InterfaceStart.token -= 5;
            op.hp -= 5;
            InterfaceStart.attack += 3;
            InterfaceStart.defense += 1;
            InterfaceStart.hp += 4;
            InterfaceStart.hungryness -= 4;
            InterfaceStart.cleanness -= 3;
            InterfaceStart.happiness -= 2;
        } else if (InterfaceStart.tra.equals("2")) {
            InterfaceStart.token -= 6;
            op.hp -= 7;
            InterfaceStart.attack += 2;
            InterfaceStart.defense += 2;
            InterfaceStart.hp += 6;
            InterfaceStart.hungryness -= 3;
            InterfaceStart.cleanness -= 4;
            InterfaceStart.happiness -= 3;
        } else if (InterfaceStart.tra.equals("3")) {
            InterfaceStart.token -= 7;
            op.hp -= 6;
            InterfaceStart.attack += 3;
            InterfaceStart.defense += 4;
            InterfaceStart.hp += 3;
            InterfaceStart.hungryness -= 4;
            InterfaceStart.cleanness -= 3;
            InterfaceStart.happiness -= 2;
        }
    }

    @Override
    public void kerja() {
        if (InterfaceStart.tra.equals("1")) {
            InterfaceStart.token += 6;
            op.hp -= 4;
            InterfaceStart.hungryness -= 3;
            InterfaceStart.cleanness -= 2;
            InterfaceStart.happiness -= 3;
        } else if (InterfaceStart.tra.equals("2")) {
            InterfaceStart.token += 8;
            op.hp -= 5;
            InterfaceStart.hungryness -= 3;
            InterfaceStart.cleanness -= 1;
            InterfaceStart.happiness -= 3;
        } else if (InterfaceStart.tra.equals("3")) {
            InterfaceStart.token += 10;
            op.hp -= 5;
            InterfaceStart.hungryness -= 3;
            InterfaceStart.cleanness -= 2;
            InterfaceStart.happiness -= 1;
        }
    }

    @Override
    public void keluar() {
        System.out.println("YA??? KOK KELUAR ???");
        System.out.println("Franciscus Valentinus O | 0706011910004");
    }

}