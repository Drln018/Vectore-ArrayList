/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaLineal;

/**
 *
 * @author 50232
 */
public class PilaLineal {
    
    private static final int TAMPILA = 40;
    private int cima;
    private Object[] listaPila; //llevar la pila
    
    
    //contructor
    public PilaLineal(){
        cima =-1; //esta vacia
        listaPila = new Object[TAMPILA];
    }
    
    //operaciones que modifican la pila (PUSH)
    public void insertar(Object elemento) throws Exception{
        if (pilaLlena()){
            throw new Exception("StackOverFlow se llenó");
        }
        //incrementar la pila 1 
        cima++;
        listaPila[cima] = elemento;
    }
     //desapilar, quitar POP elemento de la pila
    public Object quitar()throws Exception{
        Integer aux;
        
        if(pilaVacia()){
            throw new Exception ("underflow, la pila esta vacía");
        }
        
        //guardar el elemento de la cima
        aux = (Integer) listaPila[cima];
        
        //decrementar la cima y retornar el elemento
        cima--;
        return aux;
    }
    
    //limpiar la pila
    public void limpiarPila() throws Exception{
        cima=-1;
    }
    
    //metodo acceso a la cima de la pila
    public Object cimaPila() throws Exception{
        if(pilaVacia()){
            throw new Exception("pila Vacía, no se puede");
        }
        return listaPila[cima];
    }
    
    //verifica estado de la pila
    public boolean pilaVacia(){
        return cima==-1;
    }
    
    //verificar si esta llena 
    public boolean pilaLlena(){
        return cima == TAMPILA -1;
    }
}
