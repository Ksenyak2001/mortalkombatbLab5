/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies.interactionStrategy;

import mephi2023.mortalkombatbversion.heroes.Player;


/** 
* Класс Action для обозначения выбранного игроком действия.
* @autor Ксения
*/
public class Action {
    protected int code;
    /** 
    * Конструктор от переданного кода атаки. Код атаки = {0,1}, что соответствует защите или атаке соответственно.
    */
    public Action(int code){
        this.code = code;
    }
    /** 
    * Конструктор от переданного игрока.
    */
    public Action(Player p){
        this.code = p.getAttack();
    }
    
    /** 
    * Получения кода действия.
    */
    public int getCode(){
        return code;        
    }  
}
