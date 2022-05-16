/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaListaEnlazada;

/**
 *
 * @author 50232
 */
public class NodoPila {
    Object elemento;
    NodoPila siguiente; //al que apunta
    
    NodoPila(Object x)
    {
    elemento = x;
    siguiente = null;
    }
}
