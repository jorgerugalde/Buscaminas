/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;
//Importes
import java.util.Random;
import javax.swing.JOptionPane;
/**
 ** @author Jorge Rojas Ugalde
 ** @date 2016-07-27.
 **/
public class Tablero {
    private int minas [][];
    private boolean elegidos [][];
    private final int filas;
    /**
     *Metodo para crear el tablero
     */
     public int tablero [][] = new int[0][0]; { 
         filas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Filas"));
        for (int i = 0; i < filas; i++) {
            for (int j = 1; j < filas; j++) 
            {
                System.out.print("[ ]");
            }
            System.out.println("[ ]");
        }   
    }
     public int mostrarTrablero; {
     }
}