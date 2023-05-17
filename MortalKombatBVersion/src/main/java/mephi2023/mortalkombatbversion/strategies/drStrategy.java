/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс drStrategy для случая защита-регенерация.
* @autor Ксения
*/
public class drStrategy implements Strategy{

    /** 
    * Переопределенный Метод для осуществления "боя" в случае защиты-регенерации
    */
    @Override
    public int fight(Player p1, Player p2, JLabel l, JLabel l2) {
        p2.addCount_defense_enemy();
        p2.setHealth(p2.getMaxHealth()-p2.getHealth());
        l.setText(p1.getName() + " didn't attack");
        l2.setText(p2.getName() + " regenerated");
        return 0;
    }
    
    /** 
    * Переопределенный Метод для получения выигрыша 1 игрока в случае защиты-регенерации
    */
    @Override
    public int getWin1(Player p1, Player p2) {
        return -(p2.getMaxHealth()-p2.getHealth());
    }
}
