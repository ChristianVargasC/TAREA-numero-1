package tarea.pkg1;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
    double A , B , C , Resultado;
     
    Scanner Lector = new Scanner(System.in);
    System.out.println("ingrese primera variable:");      
    A = Lector.nextDouble();
    
  
    System.out.println("Ingrese segunda variable");
    B = Lector.nextDouble();
    
    
    System.out.println("Ingrese tercera variable");
    C = Lector.nextDouble();
    
    Resultado = A + B + C;
             
    System.out.println("La suma de las variables es:" + Resultado);
    
    }
    }
