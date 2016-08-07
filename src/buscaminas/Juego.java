/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;
//Importes
import javax.swing.JOptionPane;
/**
 ** @author Jorge Rojas Ugalde
 ** @date 2016-07-27.
 **/
public class Juego {
    int opciones;
    /**
     *
     */
    public void  menu () {
       // do{
    opciones=Integer.parseInt(JOptionPane.showInputDialog("Menu \n1Jugar \n2.Salir"));
    switch(opciones){
    case 1:
            System.out.println("================================");
            System.out.println("             BUSCAMINAS         ");
            System.out.println("================================");
            Tablero tb = new Tablero(); 
            
        break;
        case 2:      
        break;
    } 
    }
}