package Model;

import java.util.LinkedList;


/*Lo que se debe apilar en la pila es: 
  Ultimo elemento en entrar ultimo en salir de la lista de elemtento T*/
//pila minuscula es como el TOPE
public class Pila<T extends Base> { //Elemento - es un elemento generico

    private LinkedList<T> pila; //Se comporta como una pila

    public Pila() {//Constructor no recibe parametros
        pila = new LinkedList<>();
    }/*Recibe una lista que se crea dentro del contructor, 
                                     porque en el contructor se inisializan los atributos de una clase*/

    public void apilar(T e) {
        pila.addFirst(e);//Adicionelo en la primera posicion y retire la primera posicion SET
    }

    public T desapilar() {
        return pila.removeFirst();//GET
    }

    public boolean estaVacio() {
        return pila.isEmpty();//isEmpty para saber si esta lleno o no 
    }

    @Override
    public String toString() {
        String cad = "";
        for (T e : pila) {
            cad += " " + e.toString();
        }
        return cad += "";
    }

}
