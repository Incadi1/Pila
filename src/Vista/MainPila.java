package Vista;

import Data.Persona;
import Model.OperacionesPila;
import Data.Valor;
import Model.Pila;

public class MainPila {

    public static void main(String[] args) {
        //Pila tipo valor
        //apilar string, colocar nombre
//        
//        Pila<Valor> pilaString = new Pila<>();
//        
//        pilaString.apilar(new Valor("Ingrid"));
//        pilaString.apilar(new Valor("David"));
//        pilaString.apilar(new Valor("Sofia"));
//        pilaString.apilar(new Valor("Diego"));

        Pila<Persona> pilaPer = new Pila<>();

        pilaPer.apilar(new Persona("Ingrid", "1130", 20));
        pilaPer.apilar(new Persona("Diego", "1140", 22));
        pilaPer.apilar(new Persona("Daniela", "1150", 30));
        pilaPer.apilar(new Persona("Angie", "1160", 10));

        Pila<Persona> pilaDuplicada = OperacionesPila.duplicar(pilaPer);
        Pila<Persona> pilaInvertida = OperacionesPila.invertir(pilaPer);

        Pila<Persona> pilaPer2 = new Pila<>();

        pilaPer2.apilar(new Persona("Ingrid", "1130", 20));
        pilaPer2.apilar(new Persona("Diego", "1140", 22));
        pilaPer2.apilar(new Persona("Daniela", "1150", 30));
        pilaPer2.apilar(new Persona("Angie", "1160", 10));

        Pila<Persona> PilaConcatenar = OperacionesPila.concatenar(pilaPer, pilaPer2);

        System.out.println("Estos son los datos de la pila: \n" + pilaPer); //Escribir sout y darle en tabular "Las dos rayas"
        System.out.println("\n Estos son los datos de la pila duplicada: \n" + pilaDuplicada);
        System.out.println("\n Estos son los datos de la pila invertida: \n" + pilaInvertida);
        System.out.println("\n Estos son los datos de la pila concatenada: \n" + PilaConcatenar);

    }

}
