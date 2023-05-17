/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Интерфейс Strategy для манипуляций с взаимодействием игрока и врага.
* @autor Ксения
*/
public interface Strategy {

    /** 
    * Метод для осуществления "боя" в зависимости от переданных игроков
    */
    public int fight(Player p1, Player p2, JLabel l, JLabel l2);

    /** 
    * Метод для получения выигрыша первого игрока в зависимости от переданных игроков
    */
    public int getWin1(Player p1, Player p2);
}
