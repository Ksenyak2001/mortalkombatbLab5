/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import javax.swing.JLabel;
import mephi2023.mortalkombatbversion.heroes.Player;


/** 
* Класс Context для вызова боя или получения выигрыша при конкретной стратегии.
* @autor Ксения
*/
public class Context {
    private Strategy s;
    public Context(){}
    /** 
    * Конструктор с инициализацией от переданной стратегии
    */
    public Context(Strategy str){
        s = str;
    }    
    /** 
    * Метод для установления стратегии контексту
    */
    public void setStrategy(Strategy str){
        s = str;
    }
    /** 
    * Метод для вызова реализации боя у конкретной стратегии
    */
    public int executeFight(Player p1, Player p2, JLabel l, JLabel l2){
        return s.fight(p1, p2, l, l2);
    }    
    
    /** 
    * Метод для вызова получения выигрыша первого игрока у конкретной стратегии
    */
    public int executeGetWin1(Player p1, Player p2){
        return s.getWin1(p1, p2);
    }        
}
