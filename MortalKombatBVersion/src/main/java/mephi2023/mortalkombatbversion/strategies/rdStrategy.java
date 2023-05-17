/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс rdStrategy для случая регенерация-защита.
* @autor Ксения
*/
public class rdStrategy implements Strategy{

    /** 
    * Переопределенный Метод для осуществления "боя" в случае регенерации-защиты
    */
    @Override
    public int fight(Player p1, Player p2, JLabel l, JLabel l2) {
        p1.addCount_defense_enemy();
        p1.setHealth(p1.getMaxHealth()-p1.getHealth());
        l.setText(p1.getName() + " regenerated");
        l2.setText(p2.getName() + " didn't attack");
        return 0;
    }
    
    /** 
    * Переопределенный Метод для получения выигрыша 1 игрока в случае регенерации-защиты
    */
    @Override
    public int getWin1(Player p1, Player p2) {
        return (p1.getMaxHealth()-p1.getHealth());
    }
}
