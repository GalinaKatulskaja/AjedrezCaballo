/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

/**
 *
 * @author Galina
 */
public class Posicion {
    //Crea la clase Posicion. Crea los atributos fila (int) y columna (char) con la visibilidad adecuada.
    private int fila;
    private char columna;
    
    /*Creamos un constructor para la clase Posicion que acepte como 
    parámetros la fila y la columna y que los asigne a los atributos 
    si son correctos  y si no lance una excepción IllegalArgumentException*/
    
    public Posicion(int fila, char columna)
    {
        setFila(fila);
        setColumna(columna);
    }

    /*Creamos los métodos get y set para los atributos, que tiene en cuenta 
     que los valores son correctos 
    (las filas van del 1 al 8 -ambos inclusive- y las columnas 
    de la 'a' a la 'h' -ambos inclusive-)  y si no se lance 
    una excepción del tipo IllegalArgumentException con el mensaje. */
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if(fila<1 | fila>8)
        {
            throw new IllegalArgumentException ("ERROR. La fila introducida no es correcta");
        }
        else
        {
        this.fila = fila;
        }
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if(columna!='a'& columna!='b' & columna!='c'& columna!='d' & columna!='e' & columna!='f' & columna!='g' & columna!='h')
        {
            throw new IllegalArgumentException ("ERROR. La columna introducida no es correcta");
        }
        else
        {
        this.columna = columna;
        }
    }
    
    
    
    
}
