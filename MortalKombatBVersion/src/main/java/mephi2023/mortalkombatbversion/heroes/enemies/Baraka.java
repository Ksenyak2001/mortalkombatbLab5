/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.heroes.enemies;

import mephi2023.mortalkombatbversion.heroes.Player;

/** 
 * Класс Baraka для манипуляций с параметрами врага.
 * @autor Мария
*/
public class Baraka extends Player{
    
    /** 
    * Конструктор с инициализацией по переданным уровню, здоровью, урону и атаке.
    */ 
    public Baraka(int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
    }
    
    /** 
    * Переопределенный метод для получения имени врага.
    */
    @Override
    public String getName(){
        return "Baraka";
    }
    
}
