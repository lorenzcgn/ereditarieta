package ereditarieta;

import java.util.Scanner;


public class Ereditarieta {


    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        rettangolo rettangolo = new rettangolo();
        quadrato quadrato = new quadrato();
        
        String scelta;
        
        do{
        System.out.print("Inserire la figura: ");
        scelta=s.next();
        }while((!scelta.equalsIgnoreCase("quadrato"))&&(!scelta.equalsIgnoreCase("rettangolo"))&&(!scelta.equalsIgnoreCase("parallelepipedo")));
        
        System.out.print("Inserire la base: ");
        quadrato.setBase(s.nextDouble());
        
        if (scelta.equalsIgnoreCase("rettangolo")){
        System.out.print("Inserire la larghezza: ");
        rettangolo.setLar(s.nextDouble());
        }
        if (scelta.equalsIgnoreCase("quadrato")) quadrato.area(quadrato.getBase());
        else if (scelta.equalsIgnoreCase("rettangolo")) rettangolo.perimetro(quadrato.base, rettangolo.getLar());
        
    }
    
}
