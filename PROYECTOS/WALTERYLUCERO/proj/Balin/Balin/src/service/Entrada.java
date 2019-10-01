/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.swing.JOptionPane;

/**
 *
 * @author Walter P B
 */
public class Entrada {
      private String clave="waltry";
    private String pass="";
   public void contraseña(){
        while(clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("ingrese contraseña por favor");
            if(clave.equals(pass)==false){
                System.out.println("contraseña incorrecta");
            }
        }
        System.out.println("Bienvenido al programa");
   }  
}
