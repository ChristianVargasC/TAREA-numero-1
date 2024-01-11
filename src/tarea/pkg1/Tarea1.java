package tarea.pkg1;

import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {
     
      double base,altura,area;
    
      Scanner Lector = new Scanner( System.in);
      System.out.println("Ingrese la base");
      base = Lector.nextDouble();
     
      System.out.println("Ingrese altura del triangulo");
      altura =Lector.nextDouble();
     
      area= base*altura/2; 
     
      System.out.println("El area del triangulo es:"   + area);
     }
}
 

