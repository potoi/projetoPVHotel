/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Utilidades {

    public static int getColumnCount(Object o) {
        return o.getClass().getDeclaredFields().length;
    }
    public static String toString(int i){
       return Integer.toString(i);
    }
    public static String toString (double d){
        return Double.toString(d);
    }
        public static boolean verificaIgual(Object o, ArrayList<Object> array) {
        
        for (Object obj : array) {
            if (o == obj) {
                return true;
            }
        }
        return false;
    }
        
}
