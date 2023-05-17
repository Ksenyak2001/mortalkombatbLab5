/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mortalkombatbversion.strategies;

import java.util.Arrays;
import mephi2023.mortalkombatbversion.heroes.Player;
import mephi2023.mortalkombatbversion.strategies.interactionStrategy.Interaction;


/** 
* Класс buildStrategy для назначения конкретной стратегии.
* @autor Ксения
*/
public class buildStrategy {
    // SA = XA + S = -99/-96/-91
    // SD = XD + S = -101/-98/-93
    // SR = XR + S = -105/-102/-97
    private static final Integer saArray[] = {-91, -96, -99};
    private static final Integer sdArray[] = {-93, -98, -101};
    private static final Integer srArray[] = {-97, -102, -105};
    /** 
    * Метод, позволяющий выбрать стратегию в зависимости от переданных двух игроков (реализация взята от предыдущего автора)
    */
    public static Strategy chooseStrategy(Player p1, Player p2){
        switch (p1.getAttack()) {
            case 1 -> {
                switch (p2.getAttack()) {
                    case 1 -> {
                        return new aaStrategy();
                    }
                    case 0 -> {
                        return new adStrategy();
                    }
                    case 2 -> {
                        return new arStrategy();
                    }
                    default -> {
                    }
                }
            }
            case 0 -> {
                switch (p2.getAttack()) {
                    case 1 -> {
                        return new daStrategy();
                    }
                    case 0 -> {
                        return new ddStrategy();
                    }
                    case 2 -> {
                        return new drStrategy();
                    }
                    default -> {
                    }
                }
            }
            case -1 -> {
                switch (p2.getAttack()) {
                    case 1 -> {
                        return new saStrategy();
                    }
                    case 0 -> {
                        return new sdStrategy();
                    }
                    case 2 -> {
                        return new srStrategy();
                    }
                    default -> {
                    }
                }
            }
            case 2 -> {
                switch (p2.getAttack()) {
                    case 1 -> {
                        return new raStrategy();
                    }
                    case 0 -> {
                        return new rdStrategy();
                    }
                    default -> {
                    }
                }
            }
            default -> {
            }
        }
        return null;
    }
    
    // AA = 1
    // AD = -1
    // AR = -5
    // DA = 4
    // DD = 2
    // DR = -2
    // RA = 9
    // RD = 7
    // RR = 3
    /** 
    * Метод, позволяющий выбрать стратегию в зависимости от переданного взаимодействия. 
    */
    public static Strategy chooseStrategy(Interaction inter){
        int code = inter.getCodeInteraction();
        switch (code) {
            case 1 -> {
                return new aaStrategy();
            }
            case -1 -> {
                return new adStrategy();
            }
            case -5 -> {
                return new arStrategy();
            }
            case 4 -> {
                return new daStrategy();
            }
            case 2 -> {
                return new ddStrategy();
            }
            case -2 -> {
                return new drStrategy();
            }
            case 9 -> {
                return new raStrategy();
            }
            case 7 -> {
                return new rdStrategy();
            }
            case 3 -> {
                //return new rrStrategy();
            }            
            default -> {
                if (Arrays.asList(saArray).contains(code)){
                    return new saStrategy();
                } else if (Arrays.asList(sdArray).contains(code)){
                    return new sdStrategy();                        
                } else if (Arrays.asList(srArray).contains(code)){
                    return new srStrategy();                        
                }                
            }
        }
        return null;
    }
}
