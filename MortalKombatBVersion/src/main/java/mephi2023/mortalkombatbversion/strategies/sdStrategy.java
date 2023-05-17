/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс sdStrategy для случая оглушение-защита.
* @autor Ксения
*/
public class sdStrategy implements Strategy{

    /** 
    * Переопределенный Метод для осуществления "боя" в случае оглушение-защита
    */
    @Override
    public int fight(Player p1, Player p2, JLabel l, JLabel l2) {
        p1.addCount_defense_enemy();
        l.setText(p1.getName() + " was stunned");
        l2.setText(p2.getName() + " didn't attack");
        return 0;
    }
    
    /** 
    * Переопределенный Метод для получения выигрыша 1 игрока в случае оглушение-защита
    */
    @Override
    public int getWin1(Player p1, Player p2) {
        return 0;
    }
}
