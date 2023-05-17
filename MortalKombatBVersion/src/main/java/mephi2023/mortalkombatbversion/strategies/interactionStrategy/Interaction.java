/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies.interactionStrategy;

import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс Interaction для обозначения взаимодействия игроков.
* @autor Ксения
*/
public class Interaction {
    private ActionFirst s1;
    private ActionSecond s2;
    
    /** 
    * Конструктор от переданных действий первого и второго игроков.
    */
    public Interaction(ActionFirst s1, ActionSecond s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    /** 
    * Конструктор от переданных игроков и флага оглушения.
    */
    public Interaction(Player p1, Player p2, int stun){
        this.s1 = new ActionFirst(p1, stun);
        this.s2 = new ActionSecond(p2);
    }
    // 1     2
    // A 1   A 0
    // D 4   D 2
    // R 9   R 6
    // S -100
    
    // AA = 1
    // AD = -1
    // AR = -5
    // DA = 4
    // DD = 2
    // DR = -2
    // RA = 9
    // RD = 7
    // RR = 3
    // SA = XA + S = -99/-96/-91
    // SD = XD + S = -101/-98/-93
    // SR = XR + S = -105/-102/-97
    
    /** 
    * Метод получения кода взаимодействия игроков.
    */
    public int getCodeInteraction(){
        return s1.getCode()-s2.getCode()+s1.getStun();
    }
}
