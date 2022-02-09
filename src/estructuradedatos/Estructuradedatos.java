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
    public static void Tarea1_1() {
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
//                System.out.println("El tiempo empleado es " + suma);
//                System.out.println("El tiempo promedio es " + promedio);
                
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
    
    public static void Tarea1_2() {
        separador();
        System.out.println("-----------------[Tarea 1.1.2]--------------------");
        Scanner teclado = new Scanner(System.in);
        
        int cant;
        System.out.println("¿Cuántos alumnos hay en la clase?");
        cant = teclado.nextInt();
        
        String nombre;

        int nn = 0;
        char letra;

        
//        String[][] nAlumnos;
//        nAlumnos = new String[cant][2];
        if (cant > 0 && cant <= 10) {
            for (int i = 1; i < cant; i++) {
//                System.out.println("Alumno " + i );
                System.out.println("Ingrese su nombre " + i);
                nombre = teclado.next();

                
                System.out.println("Ingrese  su genero F= femenino, M=masculino");
                letra = teclado.next().charAt(0);
                if (letra == 'm' || letra == 'M') {
                    
                }
                if (letra  == 'F' || letra == 'f') {
                    
                }
                String[][] nAlumnos;
                nAlumnos = new String[cant][2];
                
                
            }    
        }else{
            System.out.println("Solo se pueden atender Max. 10 alumnos");
        }
        

        

        
//        for (int i = 0; i < cant; i++) { //recorre filas
//
//            for (int j = 0; j < 2; j++) { //recorre columnas
////                    System.out.println("Alumno[" + i + "]");
//
//            }
//        }
       
    }   
    
    public static void main(String[] args) {
//        Tarea1_1();
        Tarea1_2();
    }
    
}

    
