/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс aaStrategy для случая оглушение-регенерация.
* @autor Ксения
*/
public class srStrategy implements Strategy{

    /** 
    * Переопределенный Метод для осуществления "боя" в случае оглушение-регенерация
    */
    @Override
    public int fight(Player p1, Player p2, JLabel l, JLabel l2) {
        p2.setHealth((p2.getMaxHealth()-p2.getHealth())/2);
        l.setText(p1.getName() + " was stunned");
        l2.setText(p2.getName() + " regenerated");
        return 0;
    }
    
    /** 
    * Переопределенный Метод для получения выигрыша 1 игрока в случае оглушение-регенерация
    */
    @Override
    public int getWin1(Player p1, Player p2) {
        return -((p2.getMaxHealth()-p2.getHealth()/2));
    }
}
