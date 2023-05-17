/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс daStrategy для случая защита-атака.
* @autor Ксения
*/
public class daStrategy implements Strategy{

    /** 
    * Переопределенный Метод для осуществления "боя" в случае защиты-атаки
    */
    @Override
    public int fight(Player p1, Player p2, JLabel l, JLabel l2) {
        p1.addCount_attack_enemy();
        p2.addCount_defense_enemy();
        l2.setText(p1.getName() + " didn't attacked");
        return 0;
    }
    
    /** 
    * Переопределенный Метод для получения выигрыша 1 игрока в случае защиты-атаки
    */
    @Override
    public int getWin1(Player p1, Player p2) {
        return 0;
    }
}
