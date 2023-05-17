/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies.interactionStrategy;

import mephi2023.mortalkombatbversion.heroes.Player;


/** 
* Класс ActionFirst для обозначения выбранного первым игроком действия.
* @autor Ксения
*/
public class ActionFirst extends Action{
    private boolean stun;
    
    /** 
    * Конструктор от переданного кода атаки. Код атаки = {0,1}, что соответствует защите или атаке соответственно.
    */
    public ActionFirst(int code){
        super(code);
        this.stun = false;
    }
    /** 
    * Конструктор от переданного игрока и флага оглушения.
    */
    public ActionFirst(Player p, int stun){
        super(p);
        this.stun = (stun == 1);
    }
    /** 
    * Метод получения добавки от оглушения.
    */
    public int getStun(){
        if (stun){
            return -100;
        } else{
            return 0;
        }
    }
    
    /** 
    * Метод получения кода действия.
    */
    @Override
    public int getCode(){
        switch (code) {
            case 1 -> {
                return 1;
            }
            case 0 -> {
                return 4;                
            }
            case 2 -> {
                return 9;                 
            }
            default -> {
                return -1; 
            }
        }        
    }
}
