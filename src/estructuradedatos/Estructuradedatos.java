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
 
        String nombre;
        System.out.println("Escribe el nombre del empleado");
        nombre = teclado.nextLine();
        
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
        String nombre = null;
        int contN = 0;
        int Num = 0;
        String resp = null ;
        String gene ;
        
        
//        System.out.println("Ingrese el numero de alumnos");
//        Num = teclado.nextInt();
        
        int i = 0;
        String[][] alumMusic = new String[i][2];
        do {
              
            System.out.println("Ingrese los nombres" + "[" + i + "]");
            alumMusic[i][0] = teclado.next();
            contN++;
            
            System.out.println("Ingrese su genero F=femenino o M= masculino " );
            alumMusic[i][1] = teclado.next();
            System.out.println("¿Agregar otro alumno si/no?");
            resp = teclado.next();
        } while ("si".equals(resp));
            
        
//        if (alumMusic[i].compareTo("F")) {
//            
//        }
        
//        System.out.println(alumMusic[1][0] + alumMusic[i][1]);
//        for (int j = 0; j < alumMusic[i][0].length(); j++) {
//            for (int k = 0; k < alumMusic[i][1].length(); k++) {
//              System.out.println(nombre + gene);  
//            }
//        }
        
        
//        for (int i = 0; i < Num; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println("Ingrese los nombres" + "[" + i + "]");
//                nombre = teclado.next();
//                alumMusic[i][0] = nombre;
//                System.out.println("Ingrese su genero F=femenino o M= masculino ");
//                gene = teclado.next();
//                System.out.println("¿Agregar otro alumno si/no?");
//                resp = teclado.next();
//            }
//        }

        
        

//        System.out.println("nel" + contN);
        
        
        
        
//        for (int i = 0; i <= alumMusic.length; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println("¿cual es tu nombre?");
//                alumMusic[i][0] = teclado.next();
//                contN++; 
//                System.out.println("Ingrese su genero F=femenino o M= masculino ");
//                gene = teclado.next();
//                if () {
//                    
//                }
//            }
//        }    
        
//        while (contN > 0 && contN <= 10) {  
//            System.out.println("¿cual es tu nombre?");
//            nombre = teclado.next();
//            contN++;
//            System.out.println("Ingrese su genero F=femenino o M= masculino ");
//            gene = teclado.next();
//            
//        }
//        for (int i = 0; i <= alumMusic.length; i++) {
//            for (int j = 0; j < alumMusic.length; j++) {
//
//                
//                
//                System.out.println("Ingrese su genero F=femenino o M= masculino ");
//                alumMusic[i][1] = teclado.next();
//            }
//        }           
      
        
         

        
        
        
        
        
        //String[][] alumMusic = new String[cant][2];
        //String [] genero = new String[2];
        
//        if (cant <= 10) {
//            for (int i = 0; i < alumMusic.length ; i++) {
////                for (int j = 0; j < alumMusic.length ; j++) {
//                    System.out.println("¿cual es tu nombre?");
//                    nombre = teclado.next();
//                    
//                    //for (int k = 0; k < 2; k++) {
//                    System.out.println("Ingrese su genero F=femenino o M= masculino ");
//                    gene = teclado.next();
//            }
                    
//                if (nn == 0) {
//                    nn = 1;
//                    alumMusic[0]  = nombre;
//                } else { 
//                    band = 0;
//                    
//                    i = -1;
//                    
//                    do { 
//                       i = i + 1; 
//                       
//                        if (nombre == alumMusic[i]) {
//                            band = 1 ;
//                            a =  max + 1 ;
//                            b = max;
//                            
//                            do {
//                                alumMusic[a] = alumMusic[b];
//                                a = a - 1;
//                                b = b - 1;
//                            } while (a == i);
//                        }else{ 
//                            
//                        }
//                    } while (i == max || band == 1);
//                    
//                    max = max + 1;
//                    
//                    if (band == 1 ) {
//                        alumMusic[i] = nombre;
//                    } else {
//                        alumMusic[max] = nombre;
//                    }
//                }
//            }
//            
//            for (int i = 0; i < alumMusic.length; i++) {
//                System.out.println("los alumnos en orden alfabetico" + alumMusic[i]);
//            }  
//        } else {    
//            System.out.println("solo se permiten max. 10 alumnos");
//        }

    }
    
    public static void Tarea1_2_1() { //pila
        separador();
        System.out.println("-----------------[Tarea 1.2.1]--------------------");
        Scanner teclado = new Scanner(System.in);
        String caracter;
        int prioridad = 0;
        String ExpPOS = null;
        int tope;
        char operando ;
        tope = 0;
        
        
        
        System.out.println("Ingrese el caractera leer");
        caracter = teclado.next();
        String [] Pila = new String [tope];
        
        while (!" ".equals(caracter)) {            
            if ("(".equals(caracter)) { //parentesis izquierdo
                tope++;
                Pila[tope] = caracter;
            }else{ 
                if (")".equals(caracter)) { //parentesis derecho
                    while (Pila[tope] != "(") {                        
                        ExpPOS = Pila[tope];  //pop para sacar datos
                        tope--;
                        
                    }
                }else{
                    if (tope <= 0) {  //un Operando =numeros o letras
                        ExpPOS =  caracter; //se agrga el caracter a ExpPOS
                    }else{  //sino es un operador +-*^
                        while (tope > 0 && prioridad <= tope) {                            
                            ExpPOS = ExpPOS + Pila[tope];  //pop 
                            tope--; //pop
                        }
                        
                        tope++;
                        Pila[tope] = caracter;
                    }
                }
            }
        }
        
        while ( tope > 0) {            
            ExpPOS = ExpPOS + Pila[tope]; //pop
            tope--; //pop
        }
        System.out.println("El resultado en postfija es: " + ExpPOS);
    }

    public static void Tarea1_3_1() { //cola
        separador();
        System.out.println("-----------------[Tarea 1.3.1]--------------------");
        Scanner teclado = new Scanner(System.in);

//        String nombres; //dato a almacenar
        int max = 6; //maximo num. de elementos de la cola
        String Cola[] = new String[6]; //declarar el arreglo
        int F = -1; //punteros frente //eliminar
        int R = -1;//puntero  trasera o final  //insertar
        int cont = 0; //contador para contar cuantas personas hay en la cola
//        String nombres;
//        int numNombre = 0;
        String resp;
//        boolean band;
//        int num = 0;
//        F = R = -1;   
        //insertar datos
        for (int i = 0; i < Cola.length; i++) {
            System.out.println("Ingresa nombres del cliente " + "[" + i + "]");
            //            insertar/meter a la cola
            if (R < max - 1) { // para ver si hay espacio ??-1
                R++; //actualiza final R++
                Cola[R] = teclado.next();//dato
//                Cola[R] = Cola[F];
                cont ++; //contar cuantas personas hay en la cola
//                numNombre++;
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
                    for (int i = 0; i < cont; i++) {
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
        Tarea1_1_1();
        Tarea1_1_2();
        Tarea1_3_1(); //cola
    
    }
    
}