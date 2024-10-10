/*Taller 1 - Gabriel Jaime Jimenez Vargas
 * 
 */

package com.mycompany.entradasprocesossalidas;

import static java.lang.Math.sqrt;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Scanner;
import java.math;
/*Ejercicio 1  
 */
public class EntradasProcesosSalidas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese la información solicitada:");
        System.out.println(" Ingrese en nombre");
        String nombre= scanner.next();
        System.out.println("Ingrese el apellido");
        String apellido= scanner.next();
        System.out.println("El nombre completo es "+apellido+" "+nombre);
      
       /*Ejercicio 2   */
 
        System.out.println(" Ingrese el año de nacimiento:");
        int ano= scanner.nextInt();
        System.out.println(" Ingrese el mes de nacimiento:");
        int mes= scanner.nextInt();
        System.out.println("Ingrese el día");
        int dia= scanner.nextInt();
        System.out.println("La fecha de nacimiento es "+ano+"/"+mes+"/"+dia);
        /*Date fecha_actual = new Date(System.currentTimeMillis());
        System.out.println(((Object)fecha_actual).getClass().getSimpleName());*/
        LocalDate fechainicial=LocalDate.of(ano,mes,dia);
        Period diasdiferencia=Period.between(LocalDate.of(ano,mes,dia), LocalDate.now());
        System.out.println(((Object)fechainicial).getClass().getSimpleName());
        System.out.println("La edad de la persona es"+(String.format("%d años, %d meses y %d días",diasdiferencia.getYears(),diasdiferencia.getMonths(),diasdiferencia.getDays())));
        
     
        /*Ejercicio 3   */
        System.out.println(" Ingrese el primer número:");
        float primer_numero= scanner.nextInt();
        System.out.println(" Ingrese el segundo número:");
        float segundo_numero= scanner.nextInt();
        float suma=primer_numero+segundo_numero;
        float resta=primer_numero-segundo_numero;
        float cociente=primer_numero/segundo_numero;
        float residuo= primer_numero%segundo_numero;
        System.out.println("La suma de los dos números es: "+suma+"\nLa resta de los dos números es: "+resta+"\nEl cociente de los dos números es: "+cociente+"\nEl residuo de los dos números es: "+residuo);
        
        /*Ejercicio 4   */
        /*Leer las notas*/
        System.out.println(" Ingrese la nota del primer parcial (25%):");
        float primer_parcial= scanner.nextFloat();
        System.out.println(" Ingrese la nota del segundo parcial (25%):");
        float segundo_parcial= scanner.nextFloat();
        System.out.println(" Ingrese la nota del primer parcial (20%):");
        float parcial_final= scanner.nextFloat();
        System.out.println(" Ingrese la nota del primer taller (10%):");
        float primer_taller= scanner.nextFloat();
        System.out.println(" Ingrese la nota del segundo taller (10%):");
        float segundo_taller= scanner.nextFloat();
        System.out.println(" Ingrese la nota del tercer taller (10%):");
        float tercer_taller= scanner.nextFloat();
        float nota_final=(float) ((primer_parcial+segundo_parcial)*0.25+parcial_final*0.2+(primer_taller+segundo_taller+tercer_taller)*0.1);
        System.out.println("La nota final del alumno es: "+nota_final);
        
        
        /*Ejercicio 5   */
        /*Intercambio de Variables*/
        
        System.out.println(" Ingrese la variable x:");
        int variable1= scanner.nextInt();
        System.out.println(" Ingrese la variable y:");
        int variable2= scanner.nextInt();
        int vari_aux=variable2;
        int vari_aux2=variable1;
        System.out.println("La Variable X es= "+vari_aux+" y la variable Y es: "+vari_aux2);
        
              
                
        
        
        /*Ejercicio 6   */
        /*IHallar Raiz Ecuaciones*/
        System.out.println(" Ingrese la variable x:");
        int variable3= scanner.nextInt();
        System.out.println(" Ingrese la variable y:");
        int variable4= scanner.nextInt();
        int aux3=variable3+variable4;
        System.out.println("La Variable X es= "+(aux3-variable3)+" y la variable Y es: "+(aux3-variable4));
                
        /*Ejercicio 7   */
        /*Ecuación de segundo grado*/
        System.out.println(" Ingrese la variable a:");
        double a= scanner.nextDouble();
        System.out.println(" Ingrese la variable b:");
        double b= scanner.nextDouble();
        System.out.println(" Ingrese la variable c:");
        double c= scanner.nextDouble();
        /*double aux4=Math.pow(b,2);
        double aux5=(aux4-())*/
        double x1=(-b+Math.sqrt((Math.pow(b,2))-(4*a*c)))/2*a;
        double x2=(-b-Math.sqrt((Math.pow(b,2))-(4*a*c)))/2*a;
        System.out.println(" X1: "+x1+" X2: "+x2);
        
        /*Ejercicio 8   */
        /*Hallar el codigo ascci de un caracter*/
        System.out.println(" Ingrese un caracter:");
        char caracter=scanner.next().charAt(0);
        int codigoascci=(int)caracter;
        System.out.println(" El caracter "+caracter+" es el codigo Ascci "+codigoascci);
        
        
        /*Ejercicio 9   */
        /*Hallar el código ascci de un numero*/
        System.out.println(" Introduce un número del 1 al 255:");
        int numero=scanner.nextInt();
        char caracter2=(char)numero;
        System.out.println("El Codigo Ascci para el número "+numero+" es: "+caracter2);
        
        
        /*Ejercicio 10   */
        /*Hallar la cantidad de caracteres de una cadena de texto*/
        System.out.println(" Ingrese la frase a la cual desea calcularle el número de caracteres:");
        String texto =scanner.next();
        int longitud=texto.length();
        System.out.println("La longitu de caracteres es "+longitud);
        
        
           
        
        
    }
  
}
