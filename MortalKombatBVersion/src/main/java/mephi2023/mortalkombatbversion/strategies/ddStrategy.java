/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс ddStrategy для случая защита-защита.
* @autor Ксения
*/
public class ddStrategy implements Strategy{

    /** 
    * Переопределенный Метод для осуществления "боя" в случае защиты-защиты
    */
    @Override
    public int fight(Player p1, Player p2, JLabel l, JLabel l2) {
        p1.addCount_defense_enemy();
        p2.addCount_defense_enemy();
        double v = Math.random();
        int stun = 0;
        if (v <= 0.5) {
            stun = 1;
        }
        l2.setText("Both defended themselves");
        return stun;
    }
    
    /** 
    * Переопределенный Метод для получения выигрыша 1 игрока в случае защиты-защиты
    */
    @Override
    public int getWin1(Player p1, Player p2) {
        return 0;
    }
}
