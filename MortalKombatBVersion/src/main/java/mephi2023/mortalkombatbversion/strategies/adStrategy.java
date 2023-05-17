/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;
import mephi2023.mortalkombatbversion.heroes.enemies.ShaoKahn;

/** 
* Класс adStrategy для случая атака-защита.
* @autor Ксения
*/
public class adStrategy implements Strategy{

    /** 
    * Переопределенный Метод для осуществления "боя" в случае атаки-защиты
    */
    @Override
    public int fight(Player p1, Player p2, JLabel l, JLabel l2) {
        double v = Math.random();
        p1.addCount_defense_enemy();
        p2.addCount_attack_enemy();
        if (p1 instanceof ShaoKahn & v < 0.15) {
            p2.setHealth(-(int) (p1.getDamage() * 0.5));
            l2.setText("Your block is broken");
        } else {
            p1.setHealth(-(int) (p2.getDamage() * 0.5));
            l2.setText(p2.getName() + " counterattacked");
        }
        return 0;
    }
    
    /** 
    * Переопределенный Метод для получения выигрыша 1 игрока в случае атаки-защиты
    */
    @Override
    public int getWin1(Player p1, Player p2) {
        double v = Math.random();
        if (p1 instanceof ShaoKahn & v < 0.15) {
            return((int) (p1.getDamage() * 0.5));
        } else {
            return(-(int) (p2.getDamage() * 0.5));
        }
    }
}
