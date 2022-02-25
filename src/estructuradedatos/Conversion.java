/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos;

/**
 *
 * @author AlondraPalma
 */
public class Conversion {
    String Qexpre;
    int indice;
    
    //iniciar
    public Conversion (String expre){
        this.indice = 0;
        Qexpre = new String();
        Qexpre = expre;
    }
    
    //para regresar caracter 
    public String retorno(){
        String Aux = Qexpre.substring(indice,indice + 1);
        indice++;
        return (Aux);
    }
    
    //se le Agrega caracter al final de qexpresion
    public void caracterFinal(String car){
        Qexpre = Qexpre.concat(car);
        
    }
    //contar los carcteres
    public int Caracteres (){
        return  Qexpre.length();
    }
}
