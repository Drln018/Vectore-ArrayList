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
public class PilaLista {
 
    private NodoPila cima;

    public PilaLista()
    {
        cima = null;
    }

    public boolean pilaVacia()
    {
        return cima == null;
    }

    public void insertar(Object elemento)
    {
        NodoPila nuevo; //variable temporal de tiponodo pila
        nuevo = new NodoPila(elemento); //creamos el nodo con el elemento
        nuevo.siguiente = cima; //apunta hacia la cima
        cima = nuevo;
    }

    public Object quitar() throws Exception
    {
        if (pilaVacia())
            throw new Exception ("Pila vacía, no se puede extraer.");
        Object aux = cima.elemento;
        cima = cima.siguiente; //desapilamos
        return aux;
    }

    public Object cimaPila() throws Exception
    {
        if (pilaVacia())
            throw new Exception ("Pila vacía, no se puede leer cima.");
        return cima.elemento; 
    }

    public void limpiarPila()
    {
        NodoPila t;
        while(!pilaVacia()) //iteracion
        {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null; //poner en nulo el siguiente elemento
        }
    }
}
