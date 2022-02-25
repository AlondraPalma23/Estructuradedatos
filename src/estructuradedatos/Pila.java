/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos;

/**
 *
 * @author AlondraPalma
 */
public class Pila {
    String [] arrayPila;
    int elementos;
    int Tope =0;
    
    public Pila(int cant){
        elementos = cant;
        arrayPila = new String[elementos];
        Tope = -1; //top
    }
    
    public boolean pila_llena(){
        if (Tope == elementos -1) {
            return (true);
        }
        return (false);
    }
    
    public boolean pila_Vacia(){
        if (Tope ==-1) {
            return (true);
        }
        return (false);
    }
    
    public void MeterDato (String elem){
        if (!pila_llena()) {
            Tope++; //top
            arrayPila[Tope] = elem;
            elementos++;
        }
    }
    public String VerTope(){
        return (arrayPila[Tope]);
    }
    public String sacarDato(){ //pop
        String Aux = "";
        if (!pila_Vacia()) {
            Aux = arrayPila[Tope];
            Tope--;
            elementos--;
        }
        return (Aux);
    }
}

