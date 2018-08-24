package Model;

import Data.Persona;

public class OperacionesPila<T extends Base> {

    /*Se encarga de duplicar la informacion de la pila utilizando haciendo ___,
    que permita que los elementos de la pila original y la copia sean 
    independientes para __ borde*/
    public static <T extends Base> Pila<T> duplicar(Pila<T> pilaOriginal) {  //DUPLICAR

        Pila<T> PilaAux = new Pila<>();
        Pila<T> PilaCopia = new Pila<>();

        while (!pilaOriginal.estaVacio()) {
            PilaAux.apilar(pilaOriginal.desapilar());

        }

        while (!PilaAux.estaVacio()) {
            T e = PilaAux.desapilar();
            T c = (T) e.copy();
            /*Se manda para los dos lados sin esta linea... hace 
            que las dos pilas se qeuden sin un elemento ya que e la copia fantasma..
                                Elemento superficial*/
            pilaOriginal.apilar(e);
            PilaCopia.apilar(c);
        }
        return PilaCopia;

    }

    public static <T extends Base> Pila<T> invertir(Pila<T> pilaOriginal) { //INVERTIR

        Pila<T> PilaCopia = duplicar(pilaOriginal);
        Pila<T> PilaInvertida = new Pila<>();

        while (!PilaCopia.estaVacio()) {
            PilaInvertida.apilar(PilaCopia.desapilar());
        }
        return PilaInvertida;
    }

    public static <T extends Base> Pila<T> concatenar(Pila<T> Pila1, Pila<T> Pila2) { //CONCATENAR
        Pila<T> PilaDuplicar1 = duplicar(Pila1);//pilaAux1
        Pila<T> PilaDuplicar2 = duplicar(Pila2);//pilaAux2
        Pila<T> PilaDuplicar3 = invertir(PilaDuplicar2);

        while (!PilaDuplicar3.estaVacio()) {
            PilaDuplicar1.apilar(PilaDuplicar3.desapilar());
        }
        return PilaDuplicar1;

        //Hacer la cola 
    }


}
