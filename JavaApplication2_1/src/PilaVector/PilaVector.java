/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaVector;

import java.util.ArrayList;

/**
 *
 * @author 50232
 */
public class PilaVector {
    private int cima; //propiedad cima
    private ArrayList<Object> listaPila; //contenedor de los datos 

    //constructor  
    public PilaVector(){
        cima = -1; //va estar vacía
        listaPila = new ArrayList();
    }
    
    //insertar elementos, parte del push
    public void insertar(Object elemento) throws Exception {
        cima++; //aumentamos cima
        listaPila.add(elemento); //agregamos los elementos
    }

    //quitar elementos, parte del pop
    public Object quitar() throws Exception{
        Object aux;
        if (pilaVacia()){ //si la pila está vacía
        throw new Exception ("pila vacia"); //se hará una excepción
        }
        aux = listaPila.get(cima); 
        listaPila.remove(cima);//remover los elementos de la cima
        cima --; 
        return aux;
    }

    // metodo para acceso a la cima de la pila
    public Object cimaPila() throws Exception{
        if (pilaVacia()){
        throw new Exception ("pila Vacia, no se puede");
    }
        return listaPila.get(cima);
    }

    //verifica estado de la pila
    public boolean pilaVacia(){
        return cima == -1; 
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()){ //si es distinto a la pila vacía
        quitar(); //lo quitamos/desapilamos
        }
    }
}
