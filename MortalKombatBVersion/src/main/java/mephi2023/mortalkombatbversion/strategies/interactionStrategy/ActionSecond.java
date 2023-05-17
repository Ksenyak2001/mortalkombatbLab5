/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies.interactionStrategy;

import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Класс ActionSecond для обозначения выбранного вторым игроком действия.
* @autor Ксения
*/
public class ActionSecond extends Action{
    
    /** 
    * Конструктор от переданного кода атаки. Код атаки = {0,1}, что соответствует защите или атаке соответственно.
    */
    public ActionSecond(int code){
        super(code);
    }
    
    /** 
    * Конструктор от переданного игрока.
    */
    public ActionSecond(Player p){
        super(p);
    }
    
    /** 
    * Метод получения кода действия.
    */
    @Override
    public int getCode(){
        switch (code) {
            case 1 -> {
                return 0;
            }
            case 0 -> {
                return 2;                
            }
            case -1 -> {
                return -10;                 
            }
            case 2 -> {
                return 6;                 
            }
            default -> {
                return -1; 
            }
        }        
    }
}
