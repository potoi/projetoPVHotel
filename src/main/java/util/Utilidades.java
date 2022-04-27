/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Victor
 */
public class Utilidades {
    
    public static int getColumnCount(Object o){      
        return o.getClass().getDeclaredFields().length;
    }
    
}
