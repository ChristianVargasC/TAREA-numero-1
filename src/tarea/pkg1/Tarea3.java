package tarea.pkg1;

import java.util.Scanner;

public class Tarea3 {

    public static void main(String[] args) {
        
        double montot,montopago , IGV;
        Scanner Lector = new Scanner(System.in);
        System.out.println("Ingrese monto total");
        montot= Lector.nextDouble();
        
        IGV = montot*0.18;
        montopago = montot-IGV;
           
        System.out.println("El IGV 18% ES : S/." + IGV + "El monto a pagar es:" +montopago);
       
    }
    
}
