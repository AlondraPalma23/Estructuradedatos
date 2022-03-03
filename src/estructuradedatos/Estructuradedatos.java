/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos;

import java.util.Scanner;

/**
 *
 * @author AlondraPalma
 */
public class Estructuradedatos {
    public static void Datos() {
        System.out.println("UNIVERSIDAD AUTONOMA DE CAMPECHE");
        System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
        System.out.println("ALONDRA SARAI PALMA PACHECO");
    }
    public static void separador() {
        System.out.println("--------------------------------------------------");
    }
    public static void Tarea1_1_1() {
        separador();
        System.out.println("-----------------[Tarea 1.1.1]--------------------");
        Scanner teclado = new Scanner(System.in);
 
//        String nombre;
//        System.out.println("Escribe el nombre del empleado");
//        nombre = teclado.nextLine();
        
        int cant ;
        System.out.println("¿Cuántas mediciones vas a realizar");
        cant = teclado.nextInt();
        
        double[] mediTiem = new double[cant];
        double suma = 0;
        double promedio = 0;

        if (cant <= 10) {
            for (int i = 0; i < mediTiem.length; i++) {
                System.out.println("medición[" + i + "]=");
                mediTiem[i] = teclado.nextDouble();
                suma += mediTiem[i];
                promedio = suma/cant;     
            }
            
            if (suma <= 60) {
                double mayor;
                double menor;
                mayor = menor = mediTiem[0];
                int posM = 0;
                int posm = 0;
                
                for (int i = 0; i < cant; i++) {
                    if (mediTiem[i] > mayor) {
                        mayor = mediTiem[i];
                        posM = i;
                    }
                    if (mediTiem[i] < menor) {
                        menor = mediTiem[i];
                        posm = i;
                    }
                }
                System.out.println("El tiempo empleado es " + suma);
                System.out.println("El tiempo promedio es " + promedio);
                System.out.println("El menor es: " + menor + " en la posición: " + "[ " + posm + " ]");
                System.out.println("El mayor es: " + mayor + " en la posición: " + "[ " + posM + " ]");
            }else{
                System.out.println("El tiempo se pasa de 1 hora");
            }     
        }else{
            System.out.println("La cantidad de mediciones no se encuentra en el rango");
        }
    }  
    public static void Tarea1_1_2() {
        System.out.println("-----------------[Tarea 1.1.2]--------------------");
        Scanner teclado = new Scanner(System.in);
        int AlumIngreso = 0;
        int contM = 0; //contador de mujeres
        //auxiliares para ordenar
        String nomAux;
        String genAux = null;
        //auxiliares para ordenar x mujeres y hombres
        String aux1;
        String aux2;
        
        System.out.println("Ingrese el numero de alumnos");
        AlumIngreso = teclado.nextInt();
        
        String[][] alumMusic = new String[AlumIngreso][AlumIngreso]; //declara el arreglo
        
        //ingresar los a los de los alumnos
        if (AlumIngreso > 0 && AlumIngreso <= 10) {

            for (int i = 0; i < AlumIngreso; i++) {
                System.out.println("-Ingrese los nombres [" + i + "]" + "[" + 0 + "]");
                alumMusic[i][0] = teclado.next();
                System.out.println("Ingrese su genero F=femenino o M= masculino [" + i + "]" + "[" + 1 + "]");
                alumMusic[i][1] = teclado.next();
                if (alumMusic[i][1].equalsIgnoreCase("f")) {
                    contM++;
                }
            }

            for (int i = 0; i < alumMusic.length; i++) {
                for (int j = 0; j < alumMusic.length; j++) {
                    if (alumMusic[i][1].equalsIgnoreCase("f")) {
                        nomAux = alumMusic[i][0];
                        genAux = alumMusic[i][1];
                        alumMusic[i][0] = alumMusic[j][0];
                        alumMusic[i][1] = alumMusic[j][1];
                        alumMusic[j][1] = genAux;
                        alumMusic[j][0] = nomAux;
                    }
                }
            }
            //ordenar a las mujeres
            for (int i = 0; i < alumMusic.length; i++) {
                for (int j = 0; j < alumMusic.length; j++) {
                    if (alumMusic[i][0].compareToIgnoreCase(alumMusic[j][0]) < 0 && alumMusic[i][1].equalsIgnoreCase("f")) {
                        aux1 = alumMusic[i][0];
                        aux2 = alumMusic[i][1];
                        alumMusic[i][1] = alumMusic[j][1];
                        alumMusic[j][1] = aux2;
                        alumMusic[i][0] = alumMusic[j][0];
                        alumMusic[j][0] = aux1;
                    }
                }
            }
            //ordenar A LOS HOMBRES
            for (int i = 0; i < alumMusic.length; i++) {
                for (int j = 0; j < alumMusic.length && i != j; j++) {
                    if (alumMusic[i][0].compareToIgnoreCase(alumMusic[j][0]) < 0 && alumMusic[i][1].equalsIgnoreCase("m")) {
                        aux1 = alumMusic[i][0];
                        aux2 = alumMusic[i][1];
                        alumMusic[i][1] = alumMusic[j][1];
                        alumMusic[j][1] = aux2;
                        alumMusic[i][0] = alumMusic[j][0];
                        alumMusic[j][0] = aux1;
                    }
                }
            }
            System.out.println("*****************Resultado*******************");
            for (int i = 0; i < alumMusic.length; i++) {
                
                System.out.println("[ " +alumMusic[ i ] [ 0 ] + " ] [ " +  alumMusic [ i ] [ 1 ] + " ]");
            }
        }else {
            System.out.println("SOLO SE PERMITEN MAX. 10 ALUMNOS");
        }
    }
    public static void Tarea1_2_1() { //pila
        separador();
        String operadores = "-+*/+!=";
        String ExpPOS = new String();
        Pila Mipila = new Pila(100);

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la expresion infija");
        String notacion = teclado.nextLine();
        Conversion expresion = new Conversion(notacion);

        Mipila.MeterDato("(");
        expresion.caracterFinal(")");
        for (int i = 0; i < expresion.Caracteres(); i++) {
            String cadena = expresion.retorno();
            System.out.println(cadena);
            //parentesis izquierdo pila}
            if (cadena.equals("(")) {
                Mipila.MeterDato(cadena);
            } else if (operadores.indexOf(cadena) < 0 && !cadena.endsWith(")")) {
                //SI ES UN OPEANDO SE AÑADE A POSFIJA
                ExpPOS = ExpPOS.concat(cadena);
            }
            //si encuentra un operador
            if (operadores.indexOf(cadena) >= 0) {
                if (cadena.equals("!")) {
                } else {
                    //si encuentra un operador *-+/!
                    String Aux = Mipila.VerTope();
                    int precedenciaQ = operadores.indexOf(cadena); //jerarquie operadores
                    int precedenciaP = operadores.indexOf(Aux); //funcion quetiene la anterior
                    while (precedenciaP >= precedenciaQ && !Aux.equals("(")) { //comprarando caracter sig
                        ExpPOS = ExpPOS.concat(Mipila.sacarDato()); //SACAR POP
                        Aux = Mipila.VerTope();
                        precedenciaP = operadores.indexOf(Aux);

                    }
                }
                Mipila.MeterDato(cadena);
            }
            if (cadena.equals(")")) {
                String Aux = Mipila.VerTope();
                //si se encuentra un parentesis izquierdo
                while (!Aux.equals("(")) {
                    ExpPOS = ExpPOS.concat(Mipila.sacarDato()); //saca el siguiente elemento
                    Aux = Mipila.VerTope();
                }
                Mipila.sacarDato();
            }
        }
        System.out.println("*********************Resultado**********************");
        System.out.println(ExpPOS);
    } 
    
    
    // quita el comentario de la tarea a visualizar
    public static void main(String[] args) {
//        Datos();
//        separador();
//        Tarea1_1_1();
//        Tarea1_1_2();
//        Tarea1_2_1();//pila
    }
    
}