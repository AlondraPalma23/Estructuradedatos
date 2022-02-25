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
        separador();
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
                System.out.println("Ingrese los nombres [" + i + "]" + "[" + 0 + "]");
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
                    if (alumMusic[i][0].compareToIgnoreCase(alumMusic[0][0]) < 0 && alumMusic[i][1].equalsIgnoreCase("f")) {
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
            for (int i = 0; i < alumMusic.length; i++) {
                System.out.println("[ " +alumMusic[ i ] [ 0 ] + " ] [ " +  alumMusic [ i ] [ 1 ] + " ]");
//                String[] strings = alumMusic[i];
            }
        }else {
            System.out.println("SOLO SE PERMITEN MAX. 10 ALUMNOS");
        }
    }
    public static void Tarea1_3_1() { //cola
        separador();
        System.out.println("-----------------[Tarea 1.3.1]--------------------");
        Scanner teclado = new Scanner(System.in);

//        String nombres; //dato a almacenar
        int max = 5; //maximo num. de elementos de la cola
        String Cola[] = new String[5]; //declarar el arreglo
        int F = -1; //punteros frente //eliminar
        int R = -1;//puntero  trasera o final  //insertar
        int cont = 0; //contador para contar cuantas personas hay en la cola
        String resp;

        
        //insertar datos
        for (int i = 0; i < Cola.length; i++) {
            System.out.println("Ingresa nombres del cliente " + "[" + i + "]");
            //            insertar/meter a la cola
            if (R < max - 1) { // para ver si hay espacio ??-1
                R++; //actualiza final R++
                Cola[R] = teclado.next();//dato
//                Cola[R] = Cola[F];
                cont ++; //contar cuantas personas hay en la cola
                
                if (R == 0) { //se inserto el elemento a la cola *o ceros
                    F = 0;
                }
            } else {
                System.out.println("la cola esta llena");
            }
        }
        
        System.out.println("Actualmente hay en la cola: " + cont + " personas");
        
        do {                        
            if (F != -1) {
                System.out.println("-----------------------------------------");
                Cola[R]= Cola[F] ;
                System.out.println("Atendiendo a: " + Cola[R]);
                cont= cont-1;
//                System.out.println(Cola[F] );
//                cont= cont-F;
                System.out.println("El numero de personas en cola son: " + cont);
                if (F == R) {
                    F = -1;
                    R = -1;
                    System.out.println("cola vacia");
                }else{
                    F++;
                    for (int i = 0; i < cont; ++i) {
                        System.out.println(Cola[i]);
                    }
                }
            } else {
                System.out.println("cola vacía");    
            }
            
            System.out.println("¿Desea atender otro cliente? ");   
            resp = teclado.next();
             
        } while ("si".equals(resp));
        

        
        
        //        int i = 0;
//        String[][] alumMusic = new String[i][2];
//        do {
//
//            System.out.println("Ingrese los nombres" + "[" + i + "]");
//            alumMusic[i][0] = teclado.next();
//            contN++;
//
//            System.out.println("Ingrese su genero F=femenino o M= masculino ");
//            alumMusic[i][1] = teclado.next();
//            System.out.println("¿Agregar otro alumno si/no?");
//            resp = teclado.next();
//        } while ("si".equals(resp));




        
//        while (!"si".equals(resp)) {            
//            //eliminar cola o sacar dato o leer
//            System.out.println("En cola...." + R + "personas");
//            for (int i = 0; i < Cola.length; i++) {
//                if (F != -1) {
//                    nombres = Cola[F]; //dato
//                    if (F == R) {
//                        F = -1;
//                        R = -1;
//                    }else{
//                        F = F +1;
//                        System.out.println(Cola[F]);
////                        return;
//                    }
//                } else {
//                    System.out.println("cola vacia");
//                }
//            }
//        }
        
//        if ("si".equals(resp) || resp == "SI") {
//            System.out.println("Atendiendo a: " + Cola[F]);
//            System.out.println("En cola...." + R + "personas");
//            for (int i = 0; i < Cola.length; i++) {
//                if (F != -1) {
//                    nombres = Cola[F];
//                    
//                    if (F == R) {
//                        F = -1;
//                        R = -1;
//                    }else{
//                        F++;
//                    }
//                }else{    
//                    
//                }
//            }
//        }       
//        
        
//            //eliminar cola o sacar dato o leer
//            
//            if (F != -1) { // si hay elementos dentro de la cola o ver q no este vacia
//                nombres = teclado.next();
//                Cola[F] = nombres; //dato
//                if (F == R) { //si solo hay un elemento *-1
//                    F = -1;  //*-1
//                    R = - 1; //la cola esta vacia *-1
//                } else {
//                    F++; //f++
//                }
//                //return nombres; //dato
//            } else {
//                System.out.println("Cola vacía ");
//                //return null; 
//            }
    }

    // quita el comentario de la tarea a visualizar
    public static void main(String[] args) {
//        Datos();
        separador();
//        Tarea1_1_1();
        Tarea1_1_2();
//        Tarea1_3_1(); //cola
//    
    }
    
}