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
        String nombre;
        String gene ;
        int cant= 0;
        int colum = 2;
        int nn = 0;
        int band = 0;
        int max = 0 ;
        int a  = 0;
        int b = 0 ;
        
        
        System.out.println("Ingrese la cantidad de alumnos");
        cant = teclado.nextInt();
        
        String[] alumMusic = new String[cant];
        String [] genero = new String[2];
        
        if (cant <= 10) {
            for (int i = 0; i < alumMusic.length ; i++) {
//                for (int j = 0; j < alumMusic.length ; j++) {
                    System.out.println("¿cual es tu nombre?");
                    nombre = teclado.next();
                    
                    for (int k = 0; k < 2; k++) {
                        System.out.println("Ingrese su genero F=femenino o M= masculino ");
                        gene = teclado.next();
                    }
                    
//                }
                if (nn == 0) {
                    nn = 1;
                    alumMusic[0]  = nombre;
                } else { 
                    band = 0;
                    
                    i = -1;
                    
                    do { 
                       i = i + 1; 
                       
                        if (nombre < alumMusic[i]) {
                            band = 1 ;
                            a =  max + 1 ;
                            b = max;
                            
                            do {
                                alumMusic[a] = alumMusic[b];
                                a = a - 1;
                                b = b - 1;
                            } while (a == i);
                        }else{ 
                            
                        }
                    } while (i == max || band == 1);
                    
                    max = max + 1;
                    
                    if (band == 1 ) {
                        alumMusic[i] = nombre;
                    } else {
                        alumMusic[max] = nombre;
                    }
                }
            }
            System.out.println("nombres son:" + alumMusic);
            
//            for (int i = 0; i < alumMusic.length; i++) {
//                for (int j = 0; j < alumMusic.length; j++) {
//                    System.out.println(alumMusic[i][j]);
//                }
//            }   
        } else {    
            System.out.println("solo se permiten max. 10 alumnos");
        }

    }
    
    // quita el comentario de la tarea a visualizar
    public static void main(String[] args) {
        Datos();
        separador();
//        Tarea1_1();
        Tarea1_2();

    }
    
}