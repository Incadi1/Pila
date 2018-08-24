
package Data;

import Model.Base;

public class Persona extends Base{
    
    private String nombre;
    private String id;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

  
    public int getEdad() {
        return edad;
    }

 
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + ","+ id + "," + edad + "\n";
    }

    @Override
    public Base copy() {
        return new Persona(nombre, id, edad);
    }

}
