/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс aaStrategy для случая атака-атака.
* @autor Ксения
*/
public class aaStrategy implements Strategy{

    /** 
    * Переопределенный Метод для осуществления "боя" в случае атаки-атаки
    */
    @Override
    public int fight(Player p1, Player p2, JLabel l, JLabel l2) {
        p2.setHealth(-p1.getDamage());
        l2.setText(p1.getName() + " attacked");
        p1.addCount_attack_enemy();
        p2.addCount_attack_enemy();
        return 0;
    }

    /** 
    * Переопределенный Метод для получения выигрыша 1 игрока в случае атаки-атаки
    */
    @Override
    public int getWin1(Player p1, Player p2) {
        return p1.getDamage();
    }
}
