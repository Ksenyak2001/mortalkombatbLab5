/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mephi2023.mortalkombatbversion.fabrics;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import mephi2023.mortalkombatbversion.heroes.Player;

/** 
* Интерфейс EnemyFabric для определения метода по созданию объектов.
* @autor Мария
*/
public interface EnemyFabricInterface {
    /** 
     * Метод создания объекта класса Player.
     */
    public Player create(int i);
}
