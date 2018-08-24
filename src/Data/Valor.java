package Data;

import Model.Base;

public class Valor extends Base {

    private String Texto;

    public Valor(String Texto) {
        this.Texto = Texto;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    @Override
    public String toString() {
        return  Texto + "\n";
    }
    
    

    @Override//SOBRE ESCRITURA  
    public Base copy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //LO DE ARRRIBA ES UNA LINEA EXCEPTCION QUE HAY QUE QUITARLA O SE NOS DAÑA TODO
        
        return new Valor(Texto);

    }

}
