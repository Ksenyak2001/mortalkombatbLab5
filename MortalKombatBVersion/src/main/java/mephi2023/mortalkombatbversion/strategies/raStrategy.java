/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс raStrategy для случая регенерация-атака.
* @autor Ксения
*/
public class raStrategy implements Strategy{

    /** 
    * Переопределенный Метод для осуществления "боя" в случае регенерации-атаки
    */
    @Override
    public int fight(Player p1, Player p2, JLabel l, JLabel l2) {
        p1.addCount_attack_enemy();
        p1.setHealth(-p2.getDamage()*2);
        l.setText(p1.getName() + " try regenerated");
        l2.setText(p2.getName() + " attacked");
        return 0;
    }
    
    /** 
    * Переопределенный Метод для получения выигрыша 1 игрока в случае регенерации-атаки
    */
    @Override
    public int getWin1(Player p1, Player p2) {
        return (-p2.getDamage()*2);
    }
}
